package com.testing;

import java.util.ArrayList;
import java.util.List;

public class SumOFNumberStreams {
    public static void main(String[] args) {
        SumOFNumberStreams sumOFNumberStreams = new SumOFNumberStreams();
        sumOFNumberStreams.add(10);
    }

    public void add(int numberInput) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= numberInput; i++ ) {
            list.add(i);
        }

        Integer sum = list.stream().reduce(0, (a,b) -> a + b);
        System.out.println("Sum of " + numberInput + " number = " + sum);
    }
}
