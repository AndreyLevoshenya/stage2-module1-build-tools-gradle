package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

import static com.epam.utils.StringUtils.isPositiveNumber;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if(args != null) {
            if(!args.isEmpty()) {
                for (String arg : args) {
                    isPositiveNumber(arg);
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