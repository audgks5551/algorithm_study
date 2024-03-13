package org.example.lessons;

import java.util.concurrent.atomic.AtomicInteger;

public class Solution12916 {

    public boolean solution(String s) {
        AtomicInteger pCount = new AtomicInteger();
        AtomicInteger yCount = new AtomicInteger();

        new StringBuilder(s.toLowerCase())
                .chars()
                .forEach(c -> {
                    if (c == 'p') {
                        pCount.incrementAndGet();
                    }

                    if (c == 'y') {
                        yCount.incrementAndGet();
                    }
                });

        return pCount.get() == yCount.get();
    }
}
