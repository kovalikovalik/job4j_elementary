package ru.job4j;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140rubleThenEuro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180rubleThen3Dollar() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when10euroThen700Ruble() {
        float in = 10;
        float expected = 700;
        float out = Converter.euroToRuble(in);
        float eps = 0.0001f;
       Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void when10dollarThen600Ruble() {
        float in = 10;
        float expected = 600;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}