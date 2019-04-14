package com.junit.helper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraysCompareTest {

    //This test fails, since in here we are not really comparing array values
    @Test
    public void compareArrays_AsWeDoneEarlier() {
        int[] numbers = {12,3,4,1};
        int[] expected = {1,3,4,12};

        Arrays.sort(numbers);

        assertEquals(expected,numbers);
    }

    //This test passes, assertArrayEquals compares array values
    @Test
    public void compareArrays_CorrectWay() {
        int[] numbers = {12,3,4,1};
        int[] expected = {1,3,4,12};

        Arrays.sort(numbers);

        assertArrayEquals(expected,numbers);
    }

}
