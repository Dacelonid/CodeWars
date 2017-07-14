package com.dacelonid.expandednumber1;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void testSomething() {
        assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
        assertEquals("10 + 2", Kata.expandedForm(12));
        assertEquals("40 + 2", Kata.expandedForm(42));
    }
}