package br.com.nelmara.physiotherapist.framework.exceptions.custom;

public class TreatmentNotFoundException extends RuntimeException {

    public TreatmentNotFoundException() {
        super("Treatment not found");
    }

    public TreatmentNotFoundException(String message) {
        super(message);
    }
}
