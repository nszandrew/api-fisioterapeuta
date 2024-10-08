package br.com.nelmara.physiotherapist.exceptions.custom;

public class TreatmentExistsException extends RuntimeException{

    public TreatmentExistsException(){
        super("Treatment already exists or is not available");
    }

    public TreatmentExistsException(String message){
        super(message);
    }
}
