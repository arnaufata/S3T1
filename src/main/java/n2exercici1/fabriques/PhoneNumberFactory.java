package n2exercici1.fabriques;

import n2exercici1.implementacions.PhoneCat;
import n2exercici1.implementacions.PhoneItaly;
import n2exercici1.implementacions.PhonePortugal;
import n2exercici1.interficies.Address;
import n2exercici1.interficies.FabricaAbstracta;
import n2exercici1.interficies.PhoneNumber;

public class PhoneNumberFactory implements FabricaAbstracta {

    public PhoneNumber createPhoneNumber(String country) {
        switch (country.toLowerCase()) {
            case "catalonia":
                return new PhoneCat();
            case "italy":
                return new PhoneItaly();
            case "portugal":
                return new PhonePortugal();
            default:
                throw new IllegalArgumentException("Country not supported.");
        }
    }

    @Override
    public Address createAddress(String country) {
        throw new UnsupportedOperationException("PhoneNumberFactory does not create addresses.");
    }
}
