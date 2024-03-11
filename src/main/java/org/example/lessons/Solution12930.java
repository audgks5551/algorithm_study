package org.example.lessons;

import java.util.concurrent.atomic.AtomicInteger;

public class Solution12930 {
    public String solution(String s) {
        AtomicInteger index = new AtomicInteger();

        return new StringBuilder(s)
                .chars()
                .map(c -> {
                    if (c == ' ') {
                        index.set(0);
                        return ' ';
                    }

                    if (index.getAndIncrement() % 2 == 0) {
                        return Character.toUpperCase(c);
                    }

                    return Character.toLowerCase(c);
                })
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
