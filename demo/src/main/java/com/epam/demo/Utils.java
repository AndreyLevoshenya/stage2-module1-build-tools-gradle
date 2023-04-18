package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if(args != null) {
            if(!args.isEmpty()) {
                for (String arg : args) {
                    return arg != null && !arg.isEmpty() && !(Double.parseDouble(arg) <= 0);
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
        return true;
    }
}