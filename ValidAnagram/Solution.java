import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        var sChars = new char[s.length()];
        var tChars = new char[t.length()];
        for (int i = 0; i < s.length(); i++) {
            sChars[i] = s.charAt(i);
            tChars[i] = t.charAt(i);
        }
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != tChars[i]) {
                return false;
            }
        }
        return true;
    }
}
