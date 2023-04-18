package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(final String str) {
        if(str != null) {
            if (!str.isEmpty()) {
                return Double.parseDouble(str) > 0;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
