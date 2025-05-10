package patterns.creational.prototype;

public class User {
    private String email;
    private String phoneNumber;
    private Address address;

    public User(String email, String phoneNumber, Address address) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public User shallowClone() {
        return new User(this.email, this.phoneNumber, this.address);
    }

    public User deepClone() {
        return new User(this.email, this.phoneNumber, new Address(this.address.getCity(),
                this.address.getCountry(), this.address.getPinCode()));
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Address getAddress() {
        return address;
    }

}
