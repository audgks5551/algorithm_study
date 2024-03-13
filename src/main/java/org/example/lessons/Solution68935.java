package org.example.lessons;

public class Solution68935 {
    public int solution(int n) {

        // 10 => 3
        String tenToThree = Integer.toString(n, 3);

        // 뒤집기
        String reverseThree = new StringBuilder(tenToThree)
                .reverse()
                .toString();

        // 3 => 10
        return Integer.valueOf(String.valueOf(Integer.parseInt(reverseThree, 3)), 10);
    }
}
