class Solution {
    public int longestSubarray(int[] nums) {
        int max_val = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max_val) {
                max_val = num;
            }
        }

        int ans = 0;
        int curr_len = 0;

        for (int num : nums) {

            if (num == max_val) {

                curr_len++;

                if (curr_len > ans) {
                    ans = curr_len;
                }

            }
            else {

                curr_len = 0;
            
            }
        }
        return ans;
    }
}