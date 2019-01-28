package com.company;
import java.util.Scanner;

public class AddressBookDemo {

    public static void main(String[] args) {
	    Scanner usrInput = new Scanner(System.in);
	    AddressBook newAddressBook = new AddressBook();

        newAddressBook.makeContact();
        newAddressBook.printAddressBook();

    }
}
