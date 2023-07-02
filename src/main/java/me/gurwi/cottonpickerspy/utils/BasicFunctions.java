package me.gurwi.cottonpickerspy.utils;

public class BasicFunctions {

    public static boolean isInt(String str) {

        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

}
