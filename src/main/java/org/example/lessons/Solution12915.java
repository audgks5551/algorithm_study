package org.example.lessons;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution12915 {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted()
                .sorted(Comparator.comparingInt(a -> a.charAt(n)))
                .toArray(String[]::new);
    }
}
