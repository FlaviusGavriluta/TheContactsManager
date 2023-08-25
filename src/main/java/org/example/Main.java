package org.example;

public class Main {
    public static void main(String[] args) {
        // Create a new object of type ContactsManager:
        ContactsManager myContactsManager = new ContactsManager();
        Contact andy = new Contact();
        andy.name = "Andy";
        andy.email = "Andy@email.com";
        andy.phoneNumber = "0040234578";

        Contact tom = new Contact();
        tom.name = "Tom";
        tom.email = "Tom@email.com";
        tom.phoneNumber = "0040233578";

        Contact john = new Contact();
        john.name = "John";
        john.email = "John@email.com";
        john.phoneNumber = "0041234578";

        Contact ema = new Contact();
        ema.name = "Ema";
        ema.email = "Ema@email.com";
        ema.phoneNumber = "0030234578";

        myContactsManager.addContact(andy);
        myContactsManager.addContact(tom);
        myContactsManager.addContact(john);
        myContactsManager.addContact(ema);

        Contact foundContact = myContactsManager.searchContact("Tom");
        if (foundContact != null)


            System.out.println("Contact found: " + foundContact.name + ", " + foundContact.phoneNumber);
        else
            System.out.println("Contact not found!");
        System.out.println("_____________________");

        myContactsManager.listContacts();
    }
}