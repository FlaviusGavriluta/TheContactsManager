package org.example;

public class ContactsManager {
    // Fields:
    public final int MAX_CONTACTS = 500;
    Contact[] myFriends;
    private static int totalContacts;

    // Constructor:
    public ContactsManager() {
        this.myFriends = new Contact[MAX_CONTACTS];
        this.totalContacts = 0;
    }

    // Methods:
    void addContact(Contact contact) {
        if (totalContacts < 500) {
            myFriends[totalContacts] = contact;
            totalContacts++;
        } else System.out.println("The contact limit has been reached!");
    }

    void addContact(String name, String email, String phoneNumber) {
        Contact newContact = new Contact(name, email, phoneNumber);
        addContact(newContact);
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < totalContacts; i++) {
            if (myFriends[i].getName().equals(searchName)) return myFriends[i];
        }
        return null;
    }

    public void listContacts() {
        System.out.println("Contacts list: ");
        for (int i = 0; i < totalContacts; i++) {
            System.out.println(myFriends[i]);
        }
    }

    public static void printTotalContacts() {
        System.out.println("Total contacts: " + totalContacts);
    }
}
