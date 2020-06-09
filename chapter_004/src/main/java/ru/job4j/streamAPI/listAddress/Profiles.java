package ru.job4j.streamAPI.listAddress;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static void main(String[] args) {

    }
    public static List<Address> collect(List<Profile> profiles) {
        //List<Profile> rsl = null;
        //profiles.stream().map((profile) -> profile.getAddress()).distinct().forEach(System.out::println);
        //List<Profile> rsl = profiles.stream().distinct().forEach(System.out::println);
        //collect(Collectors.toList());
        List<Address> rsl = profiles.stream()
                .map((profile) -> profile.getAddress())
                .distinct()
                .sorted((new AdressByName()))
                .collect(Collectors.toList());
        //profiles.stream().distinct();
        return rsl;
    }
}
