package ru.rzn.sbt.javaschool.sort;

import ru.rzn.sbt.javaschool.comparator.LengthComparator;
import ru.rzn.sbt.javaschool.comparator.WordComparator;

import java.util.*;

public class SortWords {
    public static Collection<String> sortWords(String[] strArray) {
        Comparator<String> pcomp = new LengthComparator().thenComparing(new WordComparator());
        SortedSet<String> tsSort  = new TreeSet(pcomp);
        if (strArray != null) {
            for (String str : strArray) {
                tsSort.addAll(Arrays.asList(str.split(" ")));
            }
        }
        return tsSort;
    }
}
