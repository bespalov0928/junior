package ru.job4j.streamAPI.listAddress;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {

        List<Profile> myList = new ArrayList<>();
        myList.add(new Profile(new Address("novokusneetck", "pirogova", 18, 11)));
        myList.add(new Profile(new Address("moskva", "street", 15, 245)));
        List<Address> extend = new ArrayList<>();
        extend.add(new Address("moskva", "street", 15, 245));
        extend.add(new Address("novokusneetck", "pirogova", 18, 11));
        List<Address> result = Profiles.collect(myList);
        assertThat(extend, is(result));
    }
    @Test
    public void collectDistinct() {
        List<Profile> myList = new ArrayList<>();
        myList.add(new Profile(new Address("novokusneetck", "pirogova", 18, 11)));
        myList.add(new Profile(new Address("novokusneetck", "pirogova", 18, 11)));
        myList.add(new Profile(new Address("moskva", "street", 15, 245)));
        List<Address> extend = new ArrayList<>();
        extend.add(new Address("moskva", "street", 15, 245));
        extend.add(new Address("novokusneetck", "pirogova", 18, 11));
        List<Address> result = Profiles.collect(myList);
        assertThat(extend, is(result));
    }
}
