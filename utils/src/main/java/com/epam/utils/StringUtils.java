package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(final String str) {
        boolean isPositive = false;
        if(str != null) {
            if (!str.isEmpty()) {
                try {
                    isPositive = Double.parseDouble(str) > 0;
                }
                catch (NumberFormatException e) {
                    return false;
                }
            }
        }
        return isPositive;
    }
}
