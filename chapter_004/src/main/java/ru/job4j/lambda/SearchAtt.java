package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class SearchAtt {
    public static List<Attachment> filterSize(List<Attachment> list) {

        BiFunction<Attachment, String, Boolean> func = new BiFunction<Attachment, String, Boolean>() {
            @Override
            public Boolean apply(Attachment att, String s) {
                return att.getSize() > (Integer.parseInt(s));
            }
        };
        Supplier<String> initValue = new Supplier<String>() {
            @Override
            public String get() {
                return "100";
            }
        };
        return filter(list, func, initValue);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        BiFunction<Attachment, String, Boolean> func = new BiFunction<Attachment, String, Boolean>() {
            @Override
            public Boolean apply(Attachment att, String s) {
                return att.getName().contains(s);
            }
        };
        Supplier<String> initValue = new Supplier<String>() {
            @Override
            public String get() {
                return "bug";
            }
        };
        return filter(list, func, initValue);
    }

    private static List<Attachment> filter(List<Attachment> list, BiFunction<Attachment, String, Boolean> func, Supplier<String> initValue) {
        String x = initValue.get();
        List<Attachment> listRsl = new ArrayList<Attachment>();
        for (Attachment att : list) {
            boolean rsl = func.apply(att, x);
            if (rsl) {
                listRsl.add(att);
            }
        }
        return listRsl;
    }

    public static void main(String[] args) {
        List<Attachment> listAtt = Arrays.asList(
                new Attachment("bug", 90),
                new Attachment("name2", 100),
                new Attachment("name3", 110)
        );
        System.out.println(listAtt);
        List<Attachment> rsl = filterSize(listAtt);
        System.out.println(rsl);

        List<Attachment> rsl1 = filterName(listAtt);
        System.out.println(rsl1);
    }
}
