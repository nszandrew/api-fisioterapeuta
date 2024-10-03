package br.com.nelmara.physiotherapist.infra.usecases;

import br.com.nelmara.physiotherapist.adapters.repositories.ContractRepository;
import br.com.nelmara.physiotherapist.adapters.repositories.PatientRepository;
import br.com.nelmara.physiotherapist.domain.patient.contract.Contract;
import br.com.nelmara.physiotherapist.exceptions.custom.FileStorageException;
import br.com.nelmara.physiotherapist.exceptions.custom.MyFileNotFoundException;
import br.com.nelmara.physiotherapist.exceptions.custom.PatientNotFoundException;
import br.com.nelmara.physiotherapist.infra.config.FileStorageConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileStorageService {

    private final Path fileStorageLocation;
    private final ContractRepository repository;
    private final PatientRepository patientRepository;

    @Autowired
    public FileStorageService(FileStorageConfig fileStorageConfig, ContractRepository repository, PatientRepository patientRepository) {
        this.fileStorageLocation = Paths.get(fileStorageConfig.getUploadDir())
                .toAbsolutePath().normalize();
        this.repository = repository;
        this.patientRepository = patientRepository;

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception e) {
            throw new FileStorageException("Could not create the directory where the uploaded files will be stored", e);
        }
    }

    public String storeFile(MultipartFile file, Long id) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if (fileName.contains(".."))
                throw new FileStorageException("Sorry! file name contains invalid path sequence " + fileName);

            Path targetLocation = this.fileStorageLocation.resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            var patient = patientRepository.findById(id);
            if (patient.isEmpty()) throw new PatientNotFoundException("Patient not found");
            Contract contract = new Contract(fileName, patient);
            repository.save(contract);


            return fileName;
        } catch (Exception e) {
            throw new FileStorageException("Could not store file " + fileName, e);
        }
    }

    //MUITO IMPORTANTE QUE APENAS UM PACIENTE TENHA APENAS UM ARQUIVOS EM BANCO PARA NAO RESULTAR EM ERROS
    public Resource loadFileAsResource(Long id) {
        try {
            var contractTexts = repository.findByPatientId(id);

            if (contractTexts.isEmpty()) {
                throw new MyFileNotFoundException("Contract not found for patient with id: " + id);
            }

            Path filePath = this.fileStorageLocation.resolve(contractTexts).normalize();
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists() && resource.isReadable()) {
                return resource;
            } else {
                throw new MyFileNotFoundException("File not found or not readable: " + contractTexts);
            }

        } catch (Exception e) {
            throw new MyFileNotFoundException("Could not load file for patient with id " + id, e);
        }
    }
}