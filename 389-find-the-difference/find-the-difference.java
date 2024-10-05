class Solution {
    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;

        int n = s.length();
        for(int i = 0; i < n ; i++) {
            int temp = (int) s.charAt(i);
            sum1 += temp;
        }

        n = t.length();
        for(int i = 0; i < n ; i++) {
            int temp = (int) t.charAt(i);
            sum2 += temp;
        }
        int diff = Math.abs(sum1 - sum2);

        return (char)diff;
    }
}