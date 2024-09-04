package br.com.nelmara.physiotherapist.framework.exceptions.custom;

public class PatientNotFoundException extends RuntimeException {

    public PatientNotFoundException() {
        super("Patient not found");
    }

    public PatientNotFoundException(String message) {
        super(message);
    }
}
