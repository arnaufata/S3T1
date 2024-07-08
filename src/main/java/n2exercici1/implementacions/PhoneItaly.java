package n2exercici1.implementacions;

import n2exercici1.interficies.PhoneNumber;

public class PhoneItaly implements PhoneNumber {

    private String countryCode;
    private String number;

    @Override
    public void setPhoneNumber(String number) {
        this.countryCode = "+49";
        this.number      = number;
    }

    @Override
    public String getPhoneNumber() {
        return countryCode + "-" + number;
    }
}
