package com.github.solairerove.scala.chapter2.loop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintArrayUtil {

    private static final List<String> strings = Collections.unmodifiableList(
            Arrays.asList(
                    "Cool",
                    "Groovy",
                    "String",
                    "Ever"
            ));

    public static void printArray() {
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static void printArrayWithLambda() {
        strings.forEach(System.out::println);
    }
}
