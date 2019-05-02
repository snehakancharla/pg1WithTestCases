package com.stackroute.pg1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMuliTest {

    StringMuli sm=new StringMuli();
    String str;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void StringAdder() {

        //Act
        str=sm.stringAdd("sneha",2);
        //Assert
        assertEquals("snehahaha",str);
    }
}