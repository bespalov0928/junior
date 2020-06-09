package ru.job4j.streamAPI.listAddress;

import java.util.Comparator;
import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    public String getAddress() {
        return String.format("city: '%s', street: '%s', home: '%s', apartment: '%s'", city, street, home, apartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }

    @Override
    public String toString() {
        return String.format("city: '%s', street: '%s', home: '%s', apartment: '%s'", city, street, home, apartment);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this == null || getClass() != obj.getClass()) {
            return false;
        }
        Address address = (Address) obj;
        return Objects.equals(address.city, city)
                & Objects.equals(address.street, street)
                & Objects.equals(address.home, home)
                & Objects.equals(address.apartment, apartment);
    }


}
