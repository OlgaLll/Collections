package ru.rzn.sbt.javaschool.comparator;

import java.util.Comparator;

public class WordComparator  implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
}
