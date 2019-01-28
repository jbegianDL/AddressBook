package com.company;

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

    public void printAddressBook(){
        for(Contact contact : contactList){
            if(contact != null){
                contact.printDetails();
            }

        }
    }
}
