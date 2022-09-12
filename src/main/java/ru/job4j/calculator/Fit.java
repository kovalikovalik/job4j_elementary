package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height1) {
        double rsl = (height1 - 100) * 1.15;
        return rsl;

    }

    public static double womanWeight(double height2) {
        double rsl2 = (height2 - 110) * 1.15;
        return rsl2;

    }

    public static void main(String[] args) {
        double height1 = 187;
        double man = Fit.manWeight(height1);
        System.out.println("Man 187 is " + man);
        short height2 = 178;
        double woman = Fit.womanWeight(height2);
        System.out.println("Woman 178 is " + woman);
    }

}