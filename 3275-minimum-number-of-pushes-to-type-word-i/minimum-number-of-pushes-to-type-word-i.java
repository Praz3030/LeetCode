class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];

        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }

        int ans = 0;
        int i=0;
        
        for (char c : word.toCharArray()) {
            ans += count[c - 'a'] * ((i / 8) + 1);
            count[c - 'a'] = 0;
            i++;
        }
        return ans;
    }
}