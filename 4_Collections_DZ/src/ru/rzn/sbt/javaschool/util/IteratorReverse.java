package ru.rzn.sbt.javaschool.util;

import java.util.Iterator;
import java.util.List;

public class IteratorReverse implements Iterator<String> {

    private List<String> ls;
    private int i;

    public IteratorReverse(List<String> ls) {
        this.ls = ls;
        if (ls!=null) {
        this.i = ls.size(); }
        else i = -1;
    }

    @Override
    public boolean hasNext() {
        if (i<=0) {
            return false;
        }
        else {return true;}
    }

    @Override
    public String next() {
        if (i < 0 || i > ls.size())
            throw new IndexOutOfBoundsException("Index: "+i);
        return ls.get(--i);
    }

    @Override
    public void remove() {
       if (i < 0 || i > ls.size()-1)
            throw new IndexOutOfBoundsException("Index: "+i);
       ls.remove(i);
    }
}
