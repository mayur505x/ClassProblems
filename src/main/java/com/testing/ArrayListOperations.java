package com.testing;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayListOperations arrayListOperations = new ArrayListOperations();
        arrayListOperations.removeElement(3);
    }

    public void removeElement(int elementIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(66);
        list.add(89);
        list.add(36);
        list.add(29);
        list.add(11);
        list.add(9);
        System.out.println(list);

        list.remove(elementIndex - 1);
        System.out.println(list);
    }
}
