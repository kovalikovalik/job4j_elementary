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
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
        in = 5;
        expected = 350;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("5 euro are 350 roubles. Test result :" + passed);
        in = 10;
        expected = 600;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("10 dollars are 600 roubles. Test result :" + passed);

    }

    }
