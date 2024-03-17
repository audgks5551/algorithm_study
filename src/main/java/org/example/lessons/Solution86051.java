package org.example.lessons;

import java.util.Arrays;

public class Solution86051 {
    public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }
}
