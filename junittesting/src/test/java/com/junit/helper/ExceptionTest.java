package com.junit.helper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ExceptionTest {

    //This test fails because of the NullPointerException.
    @Test
    public void compareArrays_WithoutExpectingException_ExceptionReallyHappens() {
        int[] numbers = null;
        int[] expected = {1, 3, 4, 12};

        Arrays.sort(numbers);

        assertArrayEquals(expected, numbers);
    }

    @Test(expected = NullPointerException.class)
    public void compareArrays_WithExpectingException_ExceptionReallyHappens() {
        int[] numbers = null;
        int[] expected = {1, 3, 4, 12};

        Arrays.sort(numbers);

        assertArrayEquals(expected, numbers);
    }

    //This test fails. Because it expects an Exception, but it really doesn't throw Exception.
    @Test(expected = NullPointerException.class)
    public void compareArrays_WithExpectingException_ExceptionNotReallyHappens() {
        int[] numbers = {};

        Arrays.sort(numbers);

    }
    //To test methods that could throw Exceptions; use Test case without (expected = NullPointerException.class)
    //Because however when Exception thrown, the test Fails.


    //Test fails after this timeout
    //Can be used to test extremely time mattered functions
    @Test(timeout = 10)
    public void testSort_TestPerformance() {
        int[] array = {12, 23, 4};

        for (int i = 0; i <= 1000000; i++) {
            array[0] = i;
            Arrays.sort(array);
        }
    }

}
