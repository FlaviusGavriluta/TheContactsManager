package org.example;

public class ContactsManager {
    // Fields:
    Contact[] myFriends;
    int friendsCount;

    public ContactsManager() {
        this.myFriends = new Contact[500];
        this.friendsCount = 0;
    }
}
