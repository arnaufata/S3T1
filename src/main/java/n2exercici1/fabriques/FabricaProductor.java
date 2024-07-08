package n2exercici1.fabriques;

import n2exercici1.interficies.FabricaAbstracta;

public class FabricaProductor {
    public static FabricaAbstracta getFactory(String factory){
        switch (factory.toLowerCase()){
            case "address":
                return new AddressFactory();
            case "phonenumber":
                return new PhoneNumberFactory();
            default:
                throw new IllegalArgumentException("Tipus d'opció no vàlida.");
        }
    }
}
