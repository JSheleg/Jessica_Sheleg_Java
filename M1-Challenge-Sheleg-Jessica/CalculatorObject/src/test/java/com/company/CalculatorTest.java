package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    public void shouldAddDoublesAndInts(){
        assertEquals(8, calc.addition(1,7));
        assertEquals(5.7, calc.addition(3.4, 2.3), 0.01);
    }

    @Test
    public void shouldSubtractDoublesAndInts(){
        assertEquals(20, calc.subtraction(100, 80));
        assertEquals(1.9, calc.subtraction(7.8, 5.9), 0.01);
    }

    @Test
    public void shouldMultiplyDoublesAndInts(){
        assertEquals(20, calc.multiplication(5,4));
        assertEquals(42.48,calc.multiplication(5.9, 7.2), 0.01);
    }

    @Test
    public void shouldDivideDoublesAndInts(){
        assertEquals(4, calc.division(12,3));
        assertEquals(7.25, calc.division(17.4,2.4), 0);
    }

}