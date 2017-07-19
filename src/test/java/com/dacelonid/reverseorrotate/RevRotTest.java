package com.dacelonid.reverseorrotate;

import static org.junit.Assert.*;
import org.junit.Test;


public class RevRotTest {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: revRot");
        String s = "733049910872815764";
        testing(RevRot.revRot(s, 5), "330479108928157");
    }

    @Test
    public void test2(){
        testing(RevRot.revRot("", 0), "");
    }

    @Test
    public void test3(){
        testing(RevRot.revRot("1234", 0), "");

    }

    @Test
    public void test4(){
        testing(RevRot.revRot("1234", 5), "");
    }


}