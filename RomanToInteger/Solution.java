class Solution {
    public int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length()-1) {
                if (charValue(s.charAt(i)) < charValue(s.charAt(i+1))) {
                    total = total + ( charValue(s.charAt(i+1)) - charValue(s.charAt(i)) );
                    i++;
                }
                else {
                    total = total + charValue(s.charAt(i));
                }
            }
            else {
                total = total + charValue(s.charAt(i));
            }
        }

        return total;
    }

    public int charValue(char c) {
        int value = 0;
        switch (c) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                value = 0;
                break;
        }
        return value;
    }
}
