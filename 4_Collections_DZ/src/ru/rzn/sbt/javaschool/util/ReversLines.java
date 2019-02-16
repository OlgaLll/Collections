package ru.rzn.sbt.javaschool.util;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

public class ReversLines {
    public static Collection<String> ReverseLines(String[] strArray) {
        Deque<String> deq = new ArrayDeque<>();
        if (strArray != null) {
            for (String str : strArray) {
                deq.addFirst(str);
            }
        }
        return deq;
    }
}
