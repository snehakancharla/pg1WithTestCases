package com.stackroute.pg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class stringReverseTest {
    stringReverse stringReverseObject;
    String str;

    @Before
    public void setUp() throws Exception {
        stringReverseObject = new stringReverse();

    }

    @After
    public void tearDown() throws Exception {
        stringReverseObject = null;
    }

    @Test
    public void testRevStr() throws Exception {
        //Act
        str = stringReverseObject.reverseString("sneha");
        //Assert
        assertEquals("ahens", str);


    }
}