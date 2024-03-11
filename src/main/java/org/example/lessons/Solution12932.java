package org.example.lessons;

public class Solution12932 {

    public int[] solution(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

}
