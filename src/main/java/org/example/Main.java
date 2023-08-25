package org.example;

public class Main {
    public static void main(String[] args) {

        // Create a new object of type ContactsManager:
        ContactsManager manager = new ContactsManager();
        manager.friendsCount = 0;
        manager.myFriends[0] = new Contact();
        manager.myFriends[0].name = "John";
        manager.myFriends[0].phoneNumber = "0012223333";
        manager.myFriends[0].email = "John@gmail.com";
        manager.friendsCount++;
        manager.myFriends[1] = new Contact();
        manager.myFriends[1].name = "Tom";
        manager.myFriends[1].phoneNumber = "0321123091";
        manager.myFriends[1].email = "Tom@gmail.com";
        manager.friendsCount++;
        for (int i = 0; i < manager.friendsCount; i++) {
            System.out.println(manager.myFriends[i].name);
        }
    }
}