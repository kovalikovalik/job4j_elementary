package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / ((k + 1) * 2);
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
        double result1 = SqArea.square(12, 4);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}