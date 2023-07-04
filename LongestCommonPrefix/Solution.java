import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public String longestCommonPrefix(String[] strs) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(strs));
        if (strs.length == 0 || strings.contains(null)) {
            return "";
        }
        else if (strs.length == 1) {
            return strs[0];
        }

        int maxSearchCount = Integer.MAX_VALUE;
        for (String s : strings) {
            if (s.length() < maxSearchCount) {
                maxSearchCount = s.length();
            }
        }

        String prefix = "";
        for (int i = 0; i < maxSearchCount; i++) {
            for (int j = 1; j <strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return prefix;
                }
            }
            prefix += strs[0].charAt(i);
        }
        return prefix;
    }
}
