package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest
{
    static Calculator calc;

    @BeforeAll
    static  void setUpBeforeClass(){
        calc = new Calculator();
        System.out.println("this is before every test");
    }

    @BeforeEach
    public void setupBeforeUnit(){
        System.out.println("Before each test");
    }

    @AfterAll
    static void setupAfterClass(){
        calc = null;
        System.out.println("this is after every test");
    }

    @Test
    public void addPositiveTest(){
        assertEquals(11,calc.add(5,6));
    }

    @Test
    public void addNegativeTest(){
        assertEquals(-11,calc.add(-5,-6));
    }

    @Test
    public void subtractPositiveTest(){
        assertEquals(6,calc.subtract(12,6));
    }

    @Test
    public void subtractNegativeTest(){
        assertEquals(-6,calc.subtract(-12,-6));
    }

    @Test
    public void multiplyPositiveTest(){
        assertEquals((long)(56),calc.multiply(8,7));
    }

    @Test
    public void multiplyNegativeTest(){
        assertEquals((56),calc.multiply(-8,-7));
    }

    @Test
    public void divideTest(){
        assertEquals(8,calc.divide(16,2));
    }

    @Test
    public void divideByZeroTest(){
        assertEquals(Double.NaN,calc.divide(10,0));
    }
}
