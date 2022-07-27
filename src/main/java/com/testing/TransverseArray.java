package com.testing;

import java.util.Arrays;

public class TransverseArray {
    public static void main(String[] args) {
        int [] array = {10, 11, 12, 13, 14, 15};
        TransverseArray transverseArray = new TransverseArray();
        transverseArray.transversArray(array);
    }

    public void transversArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
