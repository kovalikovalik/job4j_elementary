package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;

    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;

    }

    public static void main(String[] args) {
        double height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        short height1 = 178;
        double woman = Fit.womanWeight(height1);
        System.out.println("Woman 178 is " + woman);
    }

}