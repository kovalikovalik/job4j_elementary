package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToRuble(float value) {
        return value * 70;
    }

    public static float dollarToRuble(float value) {
        return value * 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        float ruble = Converter.euroToRuble(5);
        float ruble1 = Converter.dollarToRuble(10);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollars.");
        System.out.println("5 euro are " + ruble + " roubles.");
        System.out.println("10 dollars are " + ruble1 + " roubles.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float in1 = 120;
        float expected1 = 2;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("120 rubles are 2. Test result : " + passed1);
        float in2 = 5;
        float expected2 = 350;
        float out2 = Converter.euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("5 euro are 350 roubles. Test result :" + passed2);
        float in3 = 10;
        float expected3 = 600;
        float out3 = Converter.dollarToRuble(in3);
        boolean passed3 = expected3 ==out3;
        System.out.println("10 dollars are 600 roubles. Test result :" + passed3);

    }

    }
