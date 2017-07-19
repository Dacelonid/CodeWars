package com.dacelonid.recursivereverse;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class ReverseTest {
    @Test
    public void testSomething() {
        assertEquals("cba", new Reverse().reverse("abc"));
    }
}