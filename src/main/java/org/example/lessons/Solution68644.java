package org.example.lessons;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution68644 {
    public int[] solution(int[] numbers) {
        return IntStream.range(0, numbers.length)
                .flatMap(i ->
                        IntStream.range(i + 1, numbers.length)
                                .map(j -> numbers[i] + numbers[j]))
                .boxed()
                .collect(Collectors.toCollection(TreeSet::new))
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
