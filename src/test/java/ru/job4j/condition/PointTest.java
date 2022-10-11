package ru.job4j.condition;


import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(dist, expected, 0.01);
    }

    @Test
    public void when55to88then0() {
        double expected = 0;
        Point a = new Point(5, 8);
        Point b = new Point(5, 8);
        double dist = a.distance(b);
        Assert.assertEquals(dist, expected, 0.01);
    }

    @Test
    public void when103to152then5dot1() {
        double expected = 5.1;
        Point a = new Point(10, 3);
        Point b = new Point(15, 2);
        double dist = a.distance(b);
        Assert.assertEquals(dist, expected, 0.01);
    }

    @Test
    public void when249to955then44dot38() {
        double expected = 48.38;
        Point a = new Point(24, 9);
        Point b = new Point(9, 55);
        double dist = a.distance(b);
        Assert.assertEquals(dist, expected, 0.01);
    }
}