package com.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({QuickTest.class, StringHelper.class})
public class AllTests {

    /**
     * When we want to group tests and run; we can use them
     * We can exclude memory consuming, time consuming tests which we don't to run often by using this
     */

}
