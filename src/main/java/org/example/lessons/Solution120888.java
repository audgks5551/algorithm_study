package org.example.lessons;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Solution120888 {

    public String solution(String my_string) {
        return String.join("", new LinkedHashSet<>(Arrays.asList(my_string.split(""))));
    }
}
