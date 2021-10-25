package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contacts> list = new ArrayList<>();

    public void operation() {
        boolean status = true;
        do {
            System.out.println("Enter the number according to to requirment");
            System.out.println("Enter 1 to Add");
            switch (sc.nextInt()) {
                case 1:
                    add();
                    break;
            }
        } while (status);
    }

    private void add() {
        Contacts contacts = new Contacts();
        System.out.println("Enter the First name:");
        String firstName = sc.next();
        contacts.setFirstName(firstName);

        System.out.println("Enter the Last name:");
        String lastName = sc.next();
        contacts.setFirstName(lastName);

        System.out.println("Enter the address:");
        String address = sc.next();
        contacts.setLastName(address);

        System.out.println("Enter the City:");
        String city = sc.next();
        contacts.setCity(city);

        System.out.println("Enter the State:");
        String state = sc.next();
        contacts.setState(state);

        System.out.println("Enter the Pin Code:");
        Long zip = sc.nextLong();
        contacts.setZip(zip);

        System.out.println("Enter the Phone Number:");
        Long phoneNumber = sc.nextLong();
        contacts.setPhoneNumber(phoneNumber);

        System.out.println("Enter the Email");
        String email = sc.next();
        contacts.setEmail(email);
        list.add(contacts);
        print();

    }

    private void print() {
        Iterator<Contacts> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
