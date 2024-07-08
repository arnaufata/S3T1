package n2exercici1;

import n2exercici1.fabriques.FabricaProductor;
import n2exercici1.implementacions.AddressCat;
import n2exercici1.implementacions.AddressItaly;
import n2exercici1.implementacions.AddressPortugal;
import n2exercici1.interficies.Address;
import n2exercici1.interficies.FabricaAbstracta;
import n2exercici1.interficies.PhoneNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    private List<Address> addresses = new ArrayList<>();
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();

    public void addEntry(String type, String country, Scanner teclat) {
        FabricaAbstracta fabrica = FabricaProductor.getFactory(type);
        if(type.equalsIgnoreCase("address")) {
            Address address;
            if(country.equalsIgnoreCase("catalonia")) {
                address = new AddressCat();
            } else if(country.equalsIgnoreCase("italy")) {
                address = new AddressItaly();
            } else if(country.equalsIgnoreCase("portugal")) {
                address = new AddressPortugal();
            } else {
                throw new IllegalArgumentException("Country not supported.");
            }
            System.out.println("Enter city: ");
            String city = teclat.nextLine();
            System.out.println("Enter street: ");
            String street = teclat.nextLine();
            System.out.println("Enter number: ");
            int number = teclat.nextInt();
            teclat.nextLine();
            System.out.println("Enter postal code: ");
            String postalCode = teclat.nextLine();
            address.setAddress(city, street, number, postalCode);
            addresses.add(address);
        } else if(type.equalsIgnoreCase("phonenumber")) {
            PhoneNumber phoneNumber = fabrica.createPhoneNumber(country);
            System.out.println("Enter phone number: ");
            String number = teclat.nextLine();
            phoneNumber.setPhoneNumber(number);
            phoneNumbers.add(phoneNumber);
        } else {
            throw new IllegalArgumentException("Type not supported.");
        }

    }

    public void printEntries() {
        addresses.forEach(address -> System.out.println("Address: " + address.getFullAddress()));
        phoneNumbers.forEach(phoneNumber -> System.out.println("Phone Number: " + phoneNumber.getPhoneNumber()));
    }
}
