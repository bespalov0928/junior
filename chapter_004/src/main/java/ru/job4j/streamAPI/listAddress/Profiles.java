package ru.job4j.streamAPI.listAddress;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {

        return profiles.stream().map((profile) -> profile.getAddress()).collect(Collectors.toList());
    }
}
