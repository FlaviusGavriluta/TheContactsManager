package org.example;

public class Contact {
    // Fields:
    String name;
    String email;
    String phoneNumber;

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
