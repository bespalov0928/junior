package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("bespalov@mail.ru", "Bespalov Dmitrii");
        map.put("ivanov@mail.ru", "Ivanov Roman");
        map.put("petrov@mail.ru", "Petrova Ylia");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(String.format("%s = %s", key, value));
        }

        System.out.println();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(String.format("%s = %s", key, value));
        }
    }
}
