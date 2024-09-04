package br.com.nelmara.physiotherapist.domain.entities.patient;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    NA("n/a");

    private String type;

    Gender(String gender) {
        this.type = gender;
    }

    public String getType() {
        return this.type;
    }

}