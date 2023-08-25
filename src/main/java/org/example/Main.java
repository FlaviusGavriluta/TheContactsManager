package org.example;

public class Main {
    public static void main(String[] args) {
        // Create a new object of type ContactsManager:
        ContactsManager myContactsManager = new ContactsManager();

        // Create new Contacts object:
        Contact andy = new Contact("Andy", "Andy@email.com", "0040234578");
        Contact tom = new Contact("Tom", "Tom@email.com", "0040233578");
        Contact john = new Contact("John", "John@email.com", "0041234578");
        Contact ema = new Contact("Ema", "Ema@email.com", "0030234578");

        myContactsManager.addContact(andy);
        myContactsManager.addContact(tom);
        myContactsManager.addContact(john);
        myContactsManager.addContact(ema);

        Contact foundContact = myContactsManager.searchContact("Tom");
        if (foundContact != null)


            System.out.println("Contact found: " + foundContact.name + ", phone: " + foundContact.phoneNumber);
        else
            System.out.println("Contact not found!");
        System.out.println("_____________________");

        myContactsManager.listContacts();
    }
}