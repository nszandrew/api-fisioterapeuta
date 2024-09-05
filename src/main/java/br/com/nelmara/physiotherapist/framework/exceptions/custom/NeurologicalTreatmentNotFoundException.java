package br.com.nelmara.physiotherapist.framework.exceptions.custom;

public class NeurologicalTreatmentNotFoundException extends RuntimeException {

    public NeurologicalTreatmentNotFoundException() {
        super("Neurological treatment not found");
    }

    public NeurologicalTreatmentNotFoundException(String message) {
        super(message);
    }
}
