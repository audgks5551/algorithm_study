package org.example.lessons;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution42748 {
    public int[] solution(int[] array, int[][] commands) {
        return Arrays.stream(commands)
                .mapToInt(command ->
                        IntStream.rangeClosed(command[0] - 1, command[1] - 1)
                                .map(i -> array[i])
                                .sorted()
                                .toArray()[command[2]-1]
                )
                .toArray();
    }
}
