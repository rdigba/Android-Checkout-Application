package com.example.checkoutapplication;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void testCalcBurgerPrice() throws Exception {
        int input = 5;
        int output;
        MainActivity mMainActivity = new MainActivity();
        output = mMainActivity.calcBurgerPrice(input);
        assertEquals(15, output);
    }

    @Test
    public void testCalcFriesPrice() throws Exception {
        int input = 3;
        int output;
        MainActivity mMainActivity = new MainActivity();
        output = mMainActivity.calcFriesPrice(input);
        assertEquals(6, output);
    }

    @Test
    public void testCalcDrinkPrice() throws Exception {
        int input = 10;
        int output;
        MainActivity mMainActivity = new MainActivity();
        output = mMainActivity.calcDrinkPrice(input);
        assertEquals(10, output);
    }

    @Test
    public void testApplyTax() throws Exception {
        int input = 45;
        double output;
        double delta = 0.01;
        MainActivity mMainActivity = new MainActivity();
        output = mMainActivity.applyTax(input);
        assertEquals(50.85, output, delta);
    }
}