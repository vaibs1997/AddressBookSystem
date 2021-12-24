package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
        PersonContact details = new PersonContact();
        details.operations();
    }
}
class PersonContact{
    Scanner sc = new Scanner(System.in);
    String[] arrayInput = new String[100];
    int j = 1,i = 0;
    public void operations(){
        int numOfContactDetails, choice;
        System.out.println("Create a contact list");
        System.out.print("Enter how many contact details you want to create: ");
        numOfContactDetails = sc.nextInt();
        int numOfDetails = numOfContactDetails;
        createContact(numOfDetails);
        System.out.println("Enter operations you want to perform contact list");
        System.out.println("1)Add new contacts");
        System.out.println("2)Edit existing contact");
        System.out.println("3)Delete existing contact");
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                int numOfAddedContacts;
                System.out.println("Enter how many contact details you want to add: ");
                numOfAddedContacts = sc.nextInt();
                int numOfAddedCon = numOfAddedContacts;
                createContact(numOfAddedCon);
                System.out.println();
                System.out.println("Contact Details are ");
                for (i = 0; i < (numOfContactDetails + numOfAddedContacts) * 7; i++) {
                    System.out.println(arrayInput[i]);
                }
            }
            case 2 -> {
                System.out.println("Enter name of person whose details you want to edit: ");
                String keyName = sc.next();
                for (i = 0; i < numOfContactDetails * 7; i++) {
                    if (keyName.equals(arrayInput[i])) {
                        System.out.println("Edit details of person: " + keyName);
                        System.out.print("Add first name: ");
                        arrayInput[i++] = sc.next();
                        System.out.print("Add last name: ");
                        arrayInput[i++] = sc.next();
                        System.out.print("Add address: ");
                        arrayInput[i++] = sc.next();
                        System.out.print("Add state: ");
                        arrayInput[i++] = sc.next();
                        System.out.print("Add zip: ");
                        arrayInput[i++] = sc.next();
                        System.out.print("Add phone number: ");
                        arrayInput[i++] = sc.next();
                        System.out.print("Add email: ");
                        arrayInput[i++] = sc.next();
                    }
                }
                System.out.println();
                System.out.println("Updated contact Details are ");
                for (i = 0; i < numOfContactDetails * 7; i++) {
                    System.out.println(arrayInput[i]);
                }
            }
            case 3 -> {
                System.out.println("Enter name of person whose details you want to delete");
                String nameToDelete = sc.next();
                int updatedNumberOfElements = numOfContactDetails * 7;
                for (i = 0; i < numOfContactDetails * 7; i++) {
                    if (nameToDelete.equals(arrayInput[i])) {
                        for (int m = 0; m < 7; m++) {
                            for (int k = i; k < numOfContactDetails * 7; k++) {
                                arrayInput[k] = arrayInput[k + 1];
                            }
                        }
                        updatedNumberOfElements = updatedNumberOfElements - 7;
                    }
                }
                System.out.println("Updated contact Details are ");
                for (i = 0; i < updatedNumberOfElements; i++) {
                    System.out.println(arrayInput[i]);
                }
            }
            default -> System.err.println("Please enter correct operation number: ");
        }
    }
    void createContact(int numOfContacts) {
        while(numOfContacts > 0) {
            System.out.println("For Person"+j);
            System.out.print("Add first name: ");
            arrayInput[i++] = sc.next();
            System.out.print("Add last name: ");
            arrayInput[i++] = sc.next();
            System.out.print("Add address: ");
            arrayInput[i++] = sc.next();
            System.out.print("Add state: ");
            arrayInput[i++] = sc.next();
            System.out.print("Add zip: ");
            arrayInput[i++] = sc.next();
            System.out.print("Add phone number: ");
            arrayInput[i++] = sc.next();
            System.out.print("Add email: ");
            arrayInput[i++] = sc.next();
            numOfContacts--;
            j++;
        }
    }
}
