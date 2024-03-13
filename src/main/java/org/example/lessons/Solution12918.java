package org.example.lessons;

public class Solution12918 {
    public boolean solution(String s) {
        for (char c : s.toCharArray()) {
            if (c >= 'A') {
                return false;
            }
        }

        return s.length() == 4 || s.length() == 6;
    }
}
