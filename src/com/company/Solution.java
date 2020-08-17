package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {


    public static int findIt(int[] a) {

        List<Integer> list = Arrays.stream(a)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> distinct = list.stream()
                .distinct()
                .collect(Collectors.toList());

        for (Integer element : distinct) {
            int freq = Collections.frequency(list, element);
            if (freq % 2 != 0) {
                System.out.println(element);
                return element;
            }
        }

        return 0;
    }
}
