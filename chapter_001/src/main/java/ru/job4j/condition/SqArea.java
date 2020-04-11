package ru.job4j.condition;

public class SqArea {

    public static void main(String[] args){
        double result;

        result = square(6,2);
        System.out.println(" p = 6, k = 2 result = "+result);

        result = square(4,1);
        System.out.println(" p = 4, k = 1 result = "+result);
    }

    public static double square(int p, int k){
        //double rsl = -1;
        double h;
        double L;
        double s;
        h = p / (2 * (k + 1));
        L = h * k;
        s = L * h;
        return s;
    }
}
