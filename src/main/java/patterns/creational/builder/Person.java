package patterns.creational.builder;

import java.time.LocalDate;

public class Person {
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final String email;
    private final String phoneNumber;

    private Person(PersonBuilder personBuilder) throws IllegalAccessException {
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.dateOfBirth = personBuilder.dateOfBirth;
        this.email = personBuilder.email;
        this.phoneNumber = personBuilder.phoneNumber;

        if(firstName == null || lastName == null){
            throw new IllegalAccessException("First Name or Last Name cannot be null");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private final String firstName;
        private final String lastName;
        private LocalDate dateOfBirth;
        private String email;
        private String phoneNumber;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() throws IllegalAccessException {
            return new Person(this);
        }
    }
}
