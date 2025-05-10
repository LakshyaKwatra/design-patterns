package patterns.creational.prototype;

public class Address {
    private String city;
    private String country;
    private String pinCode;

    public Address(String city, String country, String pinCode) {
        this.city = city;
        this.country = country;
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", pincode=" + pinCode +
                '}';
    }
}
