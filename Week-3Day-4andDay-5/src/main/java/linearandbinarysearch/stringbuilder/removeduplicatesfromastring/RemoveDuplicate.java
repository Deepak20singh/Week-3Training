package linearandbinarysearch.stringbuilder.removeduplicatesfromastring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicate {
    public static StringBuilder removeDuplicate(StringBuilder str) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> record = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int temp;
            if (record.containsKey(str.charAt(i))) {
                record.put(str.charAt(i), record.get(str.charAt(i) + 1));
            } else {
                record.put(str.charAt(i), 1);
                result.append(str.charAt(i));
            }
        }
        return result;
    }

    public static StringBuilder removeByMethod(StringBuilder str) {
        Set<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // append to result
            if (!uniqueChars.contains(currentChar)) {
                uniqueChars.add(currentChar);
                result.append(currentChar);
            }
        }

        return result;
    }
}

