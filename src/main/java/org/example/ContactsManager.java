package org.example;

public class ContactsManager {
    // Fields:
    Contact[] myFriends;
    int friendsCount;

    // Constructor:
    public ContactsManager() {
        this.myFriends = new Contact[500];
        this.friendsCount = 0;
    }

    // Methods:
    void addContact(Contact contact) {
        if (friendsCount < 500) {
            myFriends[friendsCount] = contact;
            friendsCount++;
        } else System.out.println("The contact limit has been reached!");
    }

    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName))
                return myFriends[i];
        }
        return null;
    }

    public void listContacts() {
        System.out.println("Contacts list: ");
        for (int i = 0; i < friendsCount; i++)
            System.out.println("Name: " + myFriends[i].name
                    + ", Email: " + myFriends[i].email
                    + ", Phone: " + myFriends[i].phoneNumber);
    }
}
