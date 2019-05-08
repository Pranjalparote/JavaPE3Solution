package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckConsecutiveTest {
    CheckConsecutive consobj;

    @Before
    public void setUp() throws Exception {
        consobj=new CheckConsecutive();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test


    public void checkNon() {
        boolean expected = false;

        boolean actual = consobj.checkNumber("98,96,95,94,93");

        assertEquals(expected, actual);
    }

    @Test
    public void checkConsOne() {
        boolean expected = true;
        boolean actual = consobj.checkNumber("54,53,52,51,50,49,48");

        assertEquals(expected, actual);
    }

    @Test
    public void checknonConsTwo() {
        boolean expected = false;
        boolean actual = consobj.checkNumber("1,2,3,4,5,6,6");

        assertEquals(expected, actual);
    }
}