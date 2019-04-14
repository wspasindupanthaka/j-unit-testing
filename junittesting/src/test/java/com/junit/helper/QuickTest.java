package com.junit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickTest {

    //This method runs before every CLASS
    //This method should be static
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }


    //This method runs BEFORE every TEST
    //Can be used to initialize sources that are used for tests
    @Before
    public void beforeTests() {
        System.out.println("Before Test");
    }

    @Test
    public void test1() {
        System.out.println("Test 1 Executed");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 Executed");
    }

    //This method runs AFTER every test
    @After
    public void afterTests() {
        System.out.println("After Test");
    }

}
