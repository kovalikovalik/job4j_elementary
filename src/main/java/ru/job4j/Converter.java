package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value1) {
        return value1 / 60;
    }

    public static float euroToRuble(float value2) {
        return value2 * 70;
    }

    public static float dollarToRuble(float value3) {
        return value3 * 60;
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

    }

    }
