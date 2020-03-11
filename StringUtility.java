package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String expected, String actual) {

        if (expected.equals(actual)) {
            System.out.println("PASS: Title is same: " + expected);
        } else {
            System.out.println("FAIL: Title is not same: " + actual);
        }
    }
}
