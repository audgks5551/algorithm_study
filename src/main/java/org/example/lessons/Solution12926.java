package org.example.lessons;

public class Solution12926 {
    public String solution(String s, int n) {
        return new StringBuilder(s)
                .chars()
                .map(c -> {
                    if (c == ' ') return c;

                    if ('Z' >= c) {
                        if (c + n > 'Z') {
                            return 'A' + (c + n - 'Z') - 1;
                        }
                    } else {
                        if (c + n > 'z') {
                            return 'a' + (c + n - 'z') - 1;
                        }
                    }

                    return c + n;
                })
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
