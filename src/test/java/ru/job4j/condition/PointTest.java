package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55to99then0() {
        double expected = 0;
        int x1 = 5;
        int y1 = 9;
        int x2 = 5;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when103to152then5dot1() {
        double expected = 5.1;
        int x1 = 10;
        int y1 = 3;
        int x2 = 15;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when249to955then44dot38() {
        double expected = 48.38;
        int x1 = 24;
        int y1 = 9;
        int x2 = 9;
        int y2 = 55;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}