package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x3 = x2 - x1;
        double y3 = y2 - y1;
        double x4 = Math.pow(x3, 2);
        double y4 = Math.pow(y3, 2);
        double z = x4 + y4;
        return Math.sqrt(z);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}