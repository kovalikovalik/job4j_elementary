package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxTest {

    @Test
    void whenMaxSecond() {
        int first = 10;
        int second = 20;
        int result = Max.max(first, second);
        int expected = 20;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void whenMaxThird() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assertions.assertEquals(result, expected);
    }

    @Test
    void testMax1() {
        int first = 0;
        int second = 6;
        int third = 12;
        int fourth = 18;
        int result = Max.max(first, second, third, fourth);
        int expected = 18;
        Assertions.assertEquals(result, expected);
    }
}