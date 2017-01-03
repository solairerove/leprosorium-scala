package com.github.solairerove.scala.level;

public class UpperCaseUtil {

    public static boolean nameHasUpperCase(String name) {
        boolean nameHasUpperCase = false;
        for (int i = 0; i < name.length(); ++i) {
            if (Character.isUpperCase(name.charAt(i))) {
                nameHasUpperCase = true;
                break;
            }
        }

        return nameHasUpperCase;
    }

    public static boolean nameHasUpperCaseLambdaStyle(String name) {
        return name.chars().anyMatch((int ch) -> Character.isUpperCase((char) ch));
    }
}
