package br.com.nelmara.physiotherapist.framework.exceptions.custom;

public class FileDownloadException extends RuntimeException {

    public FileDownloadException(){
        super("File download failed");
    }

    public FileDownloadException(String message) {
        super(message);
    }

}
