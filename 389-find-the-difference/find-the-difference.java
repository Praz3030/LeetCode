class Solution {
    public char findTheDifference(String s, String t) {
        char diff = 0;
        
        for (int i = 0; i < s.length(); i++) {
            diff ^= s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            diff ^= t.charAt(i);
        }

        return diff;
    }
}