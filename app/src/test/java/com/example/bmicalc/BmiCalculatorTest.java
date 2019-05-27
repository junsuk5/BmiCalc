package com.example.bmicalc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BmiCalculatorTest {

    @Test
    public void calculate() {
        BmiCalculator calculator = new BmiCalculator();

        float bmi = calculator.calculate(68, 174);

        Assert.assertEquals(bmi, 22.46, 0.001);
    }
}