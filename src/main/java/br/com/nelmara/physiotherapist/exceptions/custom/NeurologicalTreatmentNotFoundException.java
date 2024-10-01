package br.com.nelmara.physiotherapist.exceptions.custom;

public class NeurologicalTreatmentNotFoundException extends RuntimeException {

    public NeurologicalTreatmentNotFoundException() {
        super("Neurological treatment not found");
    }

    public NeurologicalTreatmentNotFoundException(String message) {
        super(message);
    }
}
