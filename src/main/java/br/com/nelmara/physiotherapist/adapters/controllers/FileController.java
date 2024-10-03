package br.com.nelmara.physiotherapist.adapters.controllers;

import br.com.nelmara.physiotherapist.infra.config.UploadFileResponseDTO;
import br.com.nelmara.physiotherapist.infra.usecases.FileStorageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/file")
public class FileController {

    private final FileStorageService service;

    public FileController(FileStorageService service) {
        this.service = service;
    }

    @PostMapping("/uploadFile")
    public ResponseEntity<UploadFileResponseDTO> uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = service.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/file/uploadFile/")
                .path(fileName)
                .toUriString();

        return new ResponseEntity<>(new UploadFileResponseDTO(fileName, fileDownloadUri, file.getContentType(), file.getSize()), HttpStatus.OK);
    }

    @PostMapping("/uploadMultiFiles")
    public List<ResponseEntity<UploadFileResponseDTO>> uploadMultiFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());
    }
}
