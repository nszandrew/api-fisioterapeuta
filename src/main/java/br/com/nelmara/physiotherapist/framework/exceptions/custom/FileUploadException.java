package br.com.nelmara.physiotherapist.framework.exceptions.custom;

public class FileUploadException extends RuntimeException {

    public FileUploadException() {
        super("Uploaded file could not be uploaded");
    }

    public FileUploadException(String message) {
        super(message);
    }
}
