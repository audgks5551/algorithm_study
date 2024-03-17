package org.example.lessons;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution120886 {

    public int solution(String before, String after) {

        String b = Arrays.stream(before.split(""))
                .sorted()
                .collect(Collectors.joining());

        String a = Arrays.stream(after.split(""))
                .sorted()
                .collect(Collectors.joining());

        return b.equals(a) ? 1 : 0;
    }
}
