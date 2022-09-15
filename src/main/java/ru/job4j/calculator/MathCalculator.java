package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDivision(double first, double second) {
        return diff(first, second)
                + division(first, second);
    }

    public static double all(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + diff(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат сложения и частного равен: " + sumAndMultiply(50, 10));
        System.out.println("Результат разности и частного равен: " + diffAndDivision(50, 10));
        System.out.println("Результат всех действий равен: " + all(50, 10));
    }
}