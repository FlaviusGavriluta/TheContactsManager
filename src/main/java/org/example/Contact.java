package org.example;

public class Contact {
    // Fields:
    private String name;
    private String email;
    private String phoneNumber;

    // Getters and Setters:
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Constructor:
    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Overloaded constructors:
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Email: " + this.email + ", Phone: " + this.phoneNumber;
    }
}
