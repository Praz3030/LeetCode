class Solution {
    public char findTheDifference(String s, String t) {
        char diff = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            diff ^= s.charAt(i);
        }
        n = t.length();
        for (int i = 0; i < t.length(); i++) {
            diff ^= t.charAt(i);
        }

        return diff;
    }
}