package com.stackroute.pg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class tomJerryTest {
    tomJerry tomJerryObject;
    String Check;

    @Before
    public void setUp() throws Exception {
        tomJerryObject = new tomJerry();

    }

    @After
    public void tearDown() throws Exception {
        tomJerryObject = null;
    }

    @Test
    public void testCheckTom() throws Exception {
        //Act
        Check = tomJerryObject.checkFunction(21);
        //Assert
        assertEquals("tom", Check);

    }

    @Test
    public void testCheckJerry() throws Exception {
        // Act
        Check = tomJerryObject.checkFunction(28);
        //Assert
        assertEquals("jerry", Check);

    }

    @Test
    public void testNeitherJomOrJerry() throws Exception {

        // Act
        Check = tomJerryObject.checkFunction(70);
        // Assert
        assertEquals("Neither Tom nor Jerry", Check);


    }
}