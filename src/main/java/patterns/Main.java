package patterns;

import java.time.LocalDate;
import patterns.creational.abstractFactory.FunctionalGUIMaker;
import patterns.creational.abstractFactory.GUI;
import patterns.creational.abstractFactory.GUIMaker;
import patterns.creational.abstractFactory.OS;
import patterns.creational.builder.Person;
import patterns.creational.prototype.Address;
import patterns.creational.prototype.User;
import patterns.creational.singleton.DoubleCheckedLockingSynchronizedSingleton;
import patterns.creational.singleton.EagerInitializationSingleton;
import patterns.creational.singleton.EnumSingleton;
import patterns.creational.singleton.SynchronizedSingleton;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        String email = "lakshya.kwatra.official@gmail.com";
        String phoneNumber = "9149338796";

        Person person = new Person.PersonBuilder("Lakshya", "Kwatra")
                .email(email)
                .phoneNumber(phoneNumber)
                .dateOfBirth(LocalDate.of(1998, 11, 16))
                .build();

        System.out.println(person);

        EagerInitializationSingleton eagerInitializationSingleton = EagerInitializationSingleton.getInstance();
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        DoubleCheckedLockingSynchronizedSingleton doubleCheckedLockingSynchronizedSingleton = DoubleCheckedLockingSynchronizedSingleton.getInstance();
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        Address address = new Address("Bangalore", "India", "560067");
        User user = new User(email, phoneNumber, address);
        User shallowClonedUser = user.shallowClone();
        User deepClonedUser = user.deepClone();

        user.getAddress().setCountry("USA");
        System.out.println("Shallow Cloned User: "+ shallowClonedUser);
        System.out.println("Deep Cloned User: "+ deepClonedUser);

        GUI windowsGUI = GUIMaker.createGUI(OS.WINDOWS);
        System.out.println(windowsGUI);
        GUI macGUI = GUIMaker.createGUI(OS.MAC);
        System.out.println(macGUI);

        windowsGUI = FunctionalGUIMaker.createGUI(OS.WINDOWS);
        System.out.println(windowsGUI);
        macGUI = FunctionalGUIMaker.createGUI(OS.MAC);
        System.out.println(macGUI);

    }
}