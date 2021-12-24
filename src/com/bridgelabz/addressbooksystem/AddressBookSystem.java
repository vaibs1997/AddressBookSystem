package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookSystem {
    static class AddressBook {
        String firstName, lastName, address, city, state;
        int zipCode;
        long phoneNumber;

        AddressBook() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter First Name: ");
            firstName = sc.nextLine();
            System.out.print("Enter Last Name: ");
            lastName = sc.nextLine();
            System.out.print("Enter Address: ");
            address = sc.nextLine();
            System.out.print("Enter City: ");
            city = sc.nextLine();
            System.out.print("Enter State: ");
            state = sc.nextLine();
            System.out.print("Enter ZipCode: ");
            zipCode = sc.nextInt();
            System.out.print("Enter PhoneNumber: ");
            phoneNumber = sc.nextLong();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook person1 = new AddressBook();
        System.out.println("Do u want to enter new contact(Y-yes/N-no)");
        String ans = sc.nextLine();
        if(ans.equals("Y"))
        {
            AddressBook person2 = new AddressBook();
        }
        else {
            System.out.println("----Thank you----");
        }
    }
}
