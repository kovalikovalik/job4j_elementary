package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void when002to202then2() {
        double expected = 2;
        Point a = new Point(0, 0, 2);
        Point b = new Point(2, 0, 2);
        double dist = a.distance3d(b);
        Assertions.assertEquals(dist, expected, 0.01);
    }

    @Test
    public void when589to589then0() {
        double expected = 0;
        Point a = new Point(5, 8, 9);
        Point b = new Point(5, 8, 9);
        double dist = a.distance3d(b);
        Assertions.assertEquals(dist, expected, 0.01);
    }

    @Test
    public void when1037to1525then5dot48() {
        double expected = 5.48;
        Point a = new Point(10, 3, 7);
        Point b = new Point(15, 2, 5);
        double dist = a.distance3d(b);
        Assertions.assertEquals(dist, expected, 0.01);
    }

    @Test
    public void when24918to95544then54dot93() {
        double expected = 54.93;
        Point a = new Point(24, 9, 18);
        Point b = new Point(9, 55, 44);
        double dist = a.distance3d(b);
        Assertions.assertEquals(dist, expected, 0.01);
    }
}