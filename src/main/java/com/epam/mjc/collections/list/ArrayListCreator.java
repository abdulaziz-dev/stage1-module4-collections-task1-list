package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<>();
        int i = 2;
        while (i < sourceList.size()){
            list.add(sourceList.get(i));
            list.add(sourceList.get(i));
            i += 3;
        }
        return list;
    }
}
