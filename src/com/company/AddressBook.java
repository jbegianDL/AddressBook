package com.company;

import java.util.Scanner;

public class AddressBook {
    private Contact [] contactList = new Contact[3];

    public void addContact(Contact contact) {
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] == null) {
                contactList[i] = contact;
                break;
            }
        }
    }

    public void makeContact(){
        Scanner usrInput = new Scanner(System.in);
        Contact newContact = new Contact();

        System.out.println("Contact Name");
        newContact.setName(usrInput.nextLine());
        System.out.println("Contact Address");
        newContact.setAddress(usrInput.nextLine());
        System.out.println("Contact Phone Number");
        newContact.setPhoneNumber(usrInput.nextLine());
        System.out.println("Contact Birthday");
        newContact.setBirthday(usrInput.nextLine());

        addContact(newContact);
    }

    public void printAddressBook(){
        for(Contact contact : contactList){
            if(contact != null){
                contact.printDetails();
            }

        }
    }

    public int numberOfContacts() {
        int numContacts = 0;
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] != null) {
                numContacts++;
            }
        }
        return numContacts;
    }

    public boolean isFull(){
        return numberOfContacts() == contactList.length;
    }
}
