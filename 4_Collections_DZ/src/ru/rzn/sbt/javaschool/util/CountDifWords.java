package ru.rzn.sbt.javaschool.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDifWords {
    public static int countDifWords(String[] strArray) {
        Set<String> setStr = new HashSet<>();
        if (strArray != null) {
            for (String str : strArray) {
                setStr.addAll(Arrays.asList(str.split(" ")));
            }
        }
        return setStr.size();
    }
}
