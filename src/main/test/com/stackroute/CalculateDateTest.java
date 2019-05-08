package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateDateTest {
    CalculateDate dateobj;

    @Before
    public void setUp() throws Exception {
        dateobj=new CalculateDate();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void startDate() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = dateobj.startDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void endDate() {
        //Arrange
        boolean expectedValue1 = true;
        //Act
        boolean actualValue1 = dateobj.endDate();
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }
}





