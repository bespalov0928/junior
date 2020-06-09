package ru.job4j.streamAPI.listAddress;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {

        List<Address> rsl = profiles.stream()
                .map((profile) -> profile.getAddress())
                .sorted((new AdressByName()))
                .distinct()
                .collect(Collectors.toList());
        return rsl;
    }
}
