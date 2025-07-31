package practise1;

public class Address  extends Object {
    String street;
    String city;
    String country;
    int postalCode;

    public Address(String street, String city, String country, int postalCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    public boolean isValidPostalCode() {
        if (postalCode > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void displayInfo() {
        System.out.println("Street: " + this.street);
        System.out.println("City: " + this.city);
        System.out.println("Country: " + this.country);
        System.out.println("Postal Code: " + this.postalCode);
    }

}
