

class Solution {
    public boolean isValid(String s) {
        String mustClosed = " ";
        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i)); 
            if ("{([".contains(currentChar)) {
                mustClosed = mustClosed + currentChar;
            }
            else if ("})]".contains(currentChar)) {
                char lastOpened = mustClosed.charAt(mustClosed.length()-1);
                if ((int) lastOpened + 1 == (int) s.charAt(i) || (int) lastOpened + 2 == (int) s.charAt(i)) {
                    mustClosed = mustClosed.substring(0, mustClosed.length()-1);
                }
                else {
                    return false;
                }
            }
        }
        if (mustClosed.length() > 1){
            return false;
        }
        return true;
    }

}
