package com.junit.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper stringHelper = new StringHelper();

    /**
     * public void is the only signature that we can use
     */

    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstPosition() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
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
