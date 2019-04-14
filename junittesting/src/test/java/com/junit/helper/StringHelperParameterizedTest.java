package com.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    StringHelper stringHelper = new StringHelper();

    private String input;
    private String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    /**
     * When swe want to pass multiple parameters to a test and test; we use them
     * @return
     */

    @Parameterized.Parameters
    public static Collection testConditions() {
        String[][] inputsAndExpectedOutputs = {{"AACD","CD"},{"ACD","CD"}};

        return Arrays.asList(inputsAndExpectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions() {
        assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstPosition() {
        assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_LengthIs1() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_LengthIs2() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_LengthIsMoreThan2Negative() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_LengthIsMoreThan2Positive() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

}
