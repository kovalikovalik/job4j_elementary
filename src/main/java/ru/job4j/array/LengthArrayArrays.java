package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {10, 20, 30}, {40, 50, 60, 70}};
        for (int[] number : numbers) {
            System.out.println(
                    "Размер вложенного массива равен: " + number.length
            );
        }
    }
}