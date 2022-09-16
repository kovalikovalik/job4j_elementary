package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenWoman177then77dot05() {
        short in = 177;
        double expected = 77.05;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.001);
    }
}