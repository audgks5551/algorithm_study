package org.example.lessons;

import java.util.HashMap;
import java.util.Map;

public class Solution42576 {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hash = new HashMap<>();

        for (String name : participant) {
            if (!hash.containsKey(name)) {
                hash.put(name, 1);
                continue;
            }

            hash.put(name, hash.get(name) + 1);
        }

        for (String name : completion) {
            hash.put(name, hash.get(name) - 1);
        }

        for (Map.Entry<String, Integer> entry : hash.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }

        return null;
    }
}
