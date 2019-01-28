package com.company;
import java.util.Scanner;

public class AddressBookDemo {

    public static void main(String[] args) {
	    Scanner usrInput = new Scanner(System.in);
	    Contact newContact = new Contact();
	    AddressBook newAddressBook = new AddressBook();

        System.out.println("Contact Name");
        newContact.setName(usrInput.nextLine());
        System.out.println("Contact Address");
        newContact.setAddress(usrInput.nextLine());
        System.out.println("Contact Phone Number");
        newContact.setPhoneNumber(usrInput.nextLine());
        System.out.println("Contact Birthday");
        newContact.setBirthday(usrInput.nextLine());

        newAddressBook.addContact(newContact);

        newAddressBook.printAddressBook();
    }
}
