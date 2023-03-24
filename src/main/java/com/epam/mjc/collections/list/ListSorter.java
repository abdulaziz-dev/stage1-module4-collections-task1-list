package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int first = function(a);
        int second = function(b);
        if (first == second){
            return Integer.parseInt(a) - Integer.parseInt(b);
        } else {
            return first - second;
        }

    }

    private int function(String number) {
        return  5 * Integer.parseInt(number) * Integer.parseInt(number) + 3;
    }
}
