package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
        PersonContact details = new PersonContact();
        details.operations();
    }
}
class PersonContact{
    public void operations(){
        String[] arrayInput = new String[100];
        int numOfContactDetails;
        Scanner sc = new Scanner(System.in);
        int i = 0,j=1,choice;
        System.out.println("Create a contact list");
        System.out.println("Enter how many contact details you want to create");
        numOfContactDetails = sc.nextInt();
        int numOfDetails = numOfContactDetails;
        while(numOfDetails > 0) {
            System.out.println("For Person"+j);
            System.out.println("Add first name");
            arrayInput[i++] = sc.next();
            System.out.println("Add last name");
            arrayInput[i++] = sc.next();
            System.out.println("Add address");
            arrayInput[i++] = sc.next();
            System.out.println("Add state");
            arrayInput[i++] = sc.next();
            System.out.println("Add zip");
            arrayInput[i++] = sc.next();
            System.out.println("Add phone number");
            arrayInput[i++] = sc.next();
            System.out.println("Add email");
            arrayInput[i++] = sc.next();
            numOfDetails--;
            j++;
        }
        System.out.println("Enter operations you want to perform contact list");
        System.out.println("1)Add new contacts");
        System.out.println("2)Edit existing contact person");
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                int numOfAddedContacts;
                System.out.println("Enter how many contact details you want to add");
                numOfAddedContacts = sc.nextInt();
                int numOfAddedCon = numOfAddedContacts;
                while (numOfAddedCon > 0) {
                    System.out.println("For Person" + j);
                    System.out.println("Add first name");
                    arrayInput[i++] = sc.next();
                    System.out.println("Add last name");
                    arrayInput[i++] = sc.next();
                    System.out.println("Add address");
                    arrayInput[i++] = sc.next();
                    System.out.println("Add state");
                    arrayInput[i++] = sc.next();
                    System.out.println("Add zip");
                    arrayInput[i++] = sc.next();
                    System.out.println("Add phone number");
                    arrayInput[i++] = sc.next();
                    System.out.println("Add email");
                    arrayInput[i++] = sc.next();
                    numOfAddedCon--;
                    j++;
                }
                System.out.println();
                System.out.println("Contact Details are ");
                for (i = 0; i < (numOfContactDetails + numOfAddedContacts) * 7; i++) {
                    System.out.println(arrayInput[i]);
                }
            }
            case 2 -> {
                System.out.println("Enter name of person whose details you want to edit");
                String keyName = sc.next();
                for (i = 0; i < numOfContactDetails * 7; i++) {
                    if (keyName.equals(arrayInput[i])) {
                        System.out.println("Edit details of person " + keyName);
                        System.out.println("Add first name");
                        arrayInput[i++] = sc.next();
                        System.out.println("Add last name");
                        arrayInput[i++] = sc.next();
                        System.out.println("Add address");
                        arrayInput[i++] = sc.next();
                        System.out.println("Add state");
                        arrayInput[i++] = sc.next();
                        System.out.println("Add zip");
                        arrayInput[i++] = sc.next();
                        System.out.println("Add phone number");
                        arrayInput[i++] = sc.next();
                        System.out.println("Add email");
                        arrayInput[i++] = sc.next();
                    }
                }
                System.out.println();
                System.out.println("Updated contact Details are ");
                for (i = 0; i < numOfContactDetails * 7; i++) {
                    System.out.println(arrayInput[i]);
                }
            }
        }
    }
}