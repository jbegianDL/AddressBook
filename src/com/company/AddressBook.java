package com.company;

import java.util.Scanner;

public class AddressBook {
    private Contact [] contactList = new Contact[3];

    //adds contact to contactList array
    public void addContact(Contact contact) {
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] == null) {
                contactList[i] = contact;
                break;
            }
        }
    }

    //prompts user and makes the contact object to add to contact list array
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

    //prints out the whole contact list array
    public void printAddressBook(){
        for(Contact contact : contactList){
            if(contact != null){
                contact.printDetails();
            }

        }
    }

    //finds number of contacts used to help determine if array is full or not
    public int numberOfContacts() {
        int numContacts = 0;
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] != null) {
                numContacts++;
            }
        }
        return numContacts;
    }

    //checks to see if array is full
    public boolean isFull(){
        return numberOfContacts() == contactList.length;
    }

    //searches array by name
    public void searchByName(){
        String wantedName;
        System.out.println("Please enter a contacts name: ");
        Scanner input = new Scanner(System.in);
        wantedName = input.nextLine();
        for(int i = 0; i < contactList.length; i++){
            if(contactList[i] != null && wantedName.equals(contactList[i].getName())){
                System.out.println("Found them! \n");
                System.out.println("Name - " + contactList[i].getName());
                System.out.println("Address- " + contactList[i].getAddress());
                System.out.println("Phone Number - " + contactList[i].getPhoneNumber());
                System.out.println("Birthday - " + contactList[i].getBirthday());
                System.out.println("\n");
                break;
            } else {
                System.out.println("Can't find who you're looking for...\n");
            }
        }
    }

    //searches array by number
    public void searchByNumber(){
        String wantedNumber;
        System.out.println("Please enter a contacts Phone Number: ");
        Scanner input = new Scanner(System.in);
        wantedNumber = input.nextLine();
        for(int i = 0; i < contactList.length; i++){
            if(contactList[i] != null && wantedNumber.equals(contactList[i].getPhoneNumber())){
                System.out.println("Found them! \n");
                System.out.println("Name - " + contactList[i].getName());
                System.out.println("Address- " + contactList[i].getAddress());
                System.out.println("Phone Number - " + contactList[i].getPhoneNumber());
                System.out.println("Birthday - " + contactList[i].getBirthday());
                System.out.println("\n");
                break;
            } else {
                System.out.println("Can't find who you're looking for...\n");
            }
        }
    }

    //deletes contact by changing contactList[i] to null
    public void deleteContact(){
        String notWantedContact;
        printAddressBook();
        System.out.println("What contact would you like to delete? \n" +
                "Please enter the name of the contact: ");
        Scanner input = new Scanner(System.in);
        notWantedContact = input.nextLine();
        for(int i = 0; i < contactList.length; i++){
            if(contactList[i] != null && notWantedContact.equals(contactList[i].getName())){
                contactList[i] = null;
                break;
            } else {
                System.out.println("Can't find who you're looking for...\n");
            }
        }
    }
}
