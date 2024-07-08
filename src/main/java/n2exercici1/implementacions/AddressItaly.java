package n2exercici1.implementacions;

import n2exercici1.interficies.Address;

public class AddressItaly implements Address {

    private String city;
    private String street;
    private int number;
    private String postalCode;

    private final String COUNTRY = "Italy";

    @Override
    public void setAddress(String city, String street, int number, String postalCode) {
        this.city       = city;
        this.street     = street;
        this.number     = number;
        this.postalCode = postalCode;
    }

    @Override
    public String getFullAddress() {
        return "C/ " + this.street + " " + this.number + ", " + this.postalCode + " "
                + this.city + ", " + COUNTRY;
    }
}
