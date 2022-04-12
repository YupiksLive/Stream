package com.company;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        num = num.stream()
                .filter(w -> w > 0)
                .filter(w -> w % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(num);
    }
}
