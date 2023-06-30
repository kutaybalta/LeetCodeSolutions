class Solution {
    public static boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        int numLen = number.length();
        for (int i = 0; i < numLen/2; i++) {
            if (number.charAt(i) != number.charAt((numLen-1) -i)) {
                return false;
            }
        }
        return true;
    }
}