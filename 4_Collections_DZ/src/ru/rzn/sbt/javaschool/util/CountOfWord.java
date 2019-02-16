package ru.rzn.sbt.javaschool.util;

import java.util.*;

public class CountOfWord {
    public static Map<String, Integer> CountOfWord(String[] strArray) {
        Map<String, Integer> hm = new HashMap<>();
        if (strArray != null) {
            for (String str : strArray) {
                List<String> ls = Arrays.asList(str.split(" "));
                for (String word : ls) {
                    if (hm.containsKey(word)) {
                        int i = hm.get(word);
                        hm.put(word, ++i);
                    } else {
                        hm.put(word, 1);
                    }
                }
            }
        }
        return hm;
    }
}
