package com.stackroute.pg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class vowConTest {
    vowCon vowelConsonants;
    String Check;

    @Before
    public void setUp() throws Exception {
        vowelConsonants =new vowCon();


    }

    @After
    public void tearDown() throws Exception {
        vowelConsonants=null;

    }

    @Test
    public void testVowel() throws Exception{

        //Act
        Check=vowelConsonants.FindVowCon("h");
        //Assert
        assertEquals("h-Consonants\n",Check);



    }

    @Test
    public void testConsonant() throws Exception {
        //Act
        Check=vowelConsonants.FindVowCon("a");
        //Assert
        assertEquals("a-vowel\n",Check);
    }

    @Test
    public void testStrigVowOrCon() throws Exception
    {
        //Act
        Check=vowelConsonants.FindVowCon("sneha");
        //Assert
        assertEquals("s-Consonants\nn-Consonants\ne-vowel\nh-Consonants\na-vowel\n",Check);

    }

}