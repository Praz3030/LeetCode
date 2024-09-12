class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            String temp = words[i];
            int m = temp.length();
            boolean isConsistent = true;

            for (int j = 0; j < m; j++) {
                if (!allowed.contains(String.valueOf(temp.charAt(j)))) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                ans++;
            }
        }
        return ans;
    }
}