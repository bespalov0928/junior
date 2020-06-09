package ru.job4j.streamAPI.listAddress;

import java.util.Comparator;

public class AdressByName implements Comparator<Address> {
    @Override
    public int compare(Address o1, Address o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}
