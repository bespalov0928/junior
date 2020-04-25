package ru.job4j.array;

/**
 * class ArrayDefinition создание массивов
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] x = new short[5];
        String[] y = new String[100500];
        float[] z = new float[40];

        String[] names = new String[4];
        names[0] = "Nikola";
        names[1] = "Mihail";
        names[2] = "Roman";
        names[3] = "Artem";

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}
