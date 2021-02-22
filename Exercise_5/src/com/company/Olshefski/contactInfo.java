package com.company.Olshefski;

public class contactInfo {
    private String name;
    private String email;

    //Constructor
    public contactInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //ToString
    @Override
    public String toString() {
        return "contactInfo{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
