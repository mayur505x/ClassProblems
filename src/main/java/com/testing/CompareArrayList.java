package com.testing;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Mayur");
        list1.add("Rahul");
        list1.add("Dyandeo");
        list1.add("Gaurab");
        list1.add("Nikhil");

        List<String> list2 = new ArrayList<>();
        list2.add("Mayur");
        list2.add("Rahul");
        list2.add("Dyandeo");
        list2.add("Gaurab");
        list2.add("Nikhil");

        CompareArrayList compareArrayList = new CompareArrayList();
        compareArrayList.equalityOfArraylist(list1, list2);
    }

    public void equalityOfArraylist(List list1, List list2) {
        if (list1.equals(list2)) {
            System.out.println("Both Arraylists are same");
        } else {
            System.out.println("Both Arraylists are not same");
        }
    }
}
