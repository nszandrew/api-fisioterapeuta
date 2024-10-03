package br.com.nelmara.physiotherapist.adapters.controllers;

import br.com.nelmara.physiotherapist.infra.config.UploadFileResponseDTO;
import br.com.nelmara.physiotherapist.infra.usecases.FileStorageService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@RestController
@RequestMapping("/api/file")
public class FileController {

    private final FileStorageService service;
    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    public FileController(FileStorageService service) {
        this.service = service;
    }

    @PostMapping("/uploadFile/{id}")
    public ResponseEntity<UploadFileResponseDTO> uploadFile(@PathVariable Long id, @RequestParam("file") MultipartFile file) {
        String fileName = service.storeFile(file, id);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/file/uploadFile/")
                .path(fileName)
                .toUriString();

        return new ResponseEntity<>(new UploadFileResponseDTO(fileName, fileDownloadUri, file.getContentType(), file.getSize()), HttpStatus.OK);
    }




    @PostMapping("/uploadMultiFiles/{id}")
    public List<ResponseEntity<UploadFileResponseDTO>> uploadMultiFiles(@RequestParam("files") MultipartFile[] files, @PathVariable Long id) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(id, file))
                .collect(Collectors.toList());
    }

//    @GetMapping("/downloadFile/{fileName:.+}")
//    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request){
//        Resource resource = service.loadFileAsResource(fileName);
//
//        String contentType = null;
//
//        try {
//            logger.info("Downloading file: " + resource.getFilename());
//            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
//
//        }catch (Exception e){
//            logger.error("Could not determine file type!");
//        }
//        if (contentType == null) {
//            contentType = "application/octet-stream";
//        }
//
//        return ResponseEntity.ok()
//                .contentType(MediaType
//                        .parseMediaType(contentType))
//                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
//                .body(resource);
//    }
@GetMapping("/downloadFile/{id}")
public ResponseEntity<Resource> downloadFile(@PathVariable Long id, HttpServletRequest request){
    var resource = service.loadFileAsResource(id);

    String contentType = null;

    try {
        contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
    } catch (Exception e) {
        logger.error("Could not determine file type for " + resource.getFilename(), e);
    }

    if (contentType == null) {
        contentType = "application/octet-stream";
    }

    return ResponseEntity.ok()
            .contentType(MediaType.parseMediaType(contentType))
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
            .body(resource);
}
}
