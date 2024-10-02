package br.com.nelmara.physiotherapist.domain.user;

public enum UserType {
    ADMIN("admin"),
    USER("user");

    private String role;

    UserType(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
