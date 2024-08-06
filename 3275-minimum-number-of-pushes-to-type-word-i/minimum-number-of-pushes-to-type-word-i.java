class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];
        
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }

        int ans = 0;
        int i = 0;
        for (int freq : count) {
            if (freq > 0) {
                ans += freq * ((i / 8) + 1);
                i++;
            }
        }
        return ans;
    }
}