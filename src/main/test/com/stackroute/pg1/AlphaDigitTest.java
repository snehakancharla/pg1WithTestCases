package com.stackroute.pg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphaDigitTest {

    AlphaDigit ad=new AlphaDigit();
    String str;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void CheckAlphaDigit() throws Exception {

        //Act
        str=ad.Check('s');
        //Assert
        assertEquals("s is lowercase alphabet.",str);

        //Act
        str=ad.Check('C');
        //Assert
        assertEquals(" is uppercase alphabet.",str);


        //Act
        str=ad.Check('9');
        //Assert
        assertEquals("9 is a digit",str);

        //Act
        str=ad.Check('$');
        //Assert
        assertEquals("special symbol",str);



    }

}