package n2exercici1.fabriques;

import n2exercici1.implementacions.AddressCat;
import n2exercici1.implementacions.AddressItaly;
import n2exercici1.implementacions.AddressPortugal;
import n2exercici1.interficies.Address;
import n2exercici1.interficies.FabricaAbstracta;
import n2exercici1.interficies.PhoneNumber;

public class AddressFactory implements FabricaAbstracta {

    @Override
    public Address createAddress(String country) {
        switch (country.toLowerCase()) {
            case "catalonia":
                return new AddressCat();
            case "italy":
                return new AddressItaly();
            case "portugal":
                return new AddressPortugal();
            default:
                throw new IllegalArgumentException("Country not supported.");
        }
    }

    @Override
    public PhoneNumber createPhoneNumber(String country) {
        throw new UnsupportedOperationException("AddressFactory does not create phone numbers.");
    }
}
