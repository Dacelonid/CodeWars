package com.dacelonid.factorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTests {

    private Factorial fact;

    @Before
    public void initFactorial() {
        fact = new Factorial();
    }

    @After
    public void afterFactorial() {
        fact = null;
    }

    @Test
    public void test_factorial0() {
        assertEquals(1, fact.factorial(0));
    }

    @Test
    public void test_factorial3() {
        assertEquals(6, fact.factorial(3));
    }

    @Test
    public void test_factorial5() {
        assertEquals(120, fact.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_factorial6() {
        fact.factorial(13);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_factorial7() {
        fact.factorial(13);
    }



}