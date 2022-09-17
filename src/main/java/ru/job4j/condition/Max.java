package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean result = left > right;
        return result ? left : right;
    }

    public static void main(String[] args) {
     int result = Max.max(2, 2);
     System.out.println(result);
    }
}