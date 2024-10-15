class Solution {
    public long minimumSteps(String s) {
        
        int left = 0;
        int right = s.length() - 1;
        long ans = 0;
        
        while (left < right) {

            while (left < right && s.charAt(left) == '0') {
                left++;
            }

            while (left < right && s.charAt(right) == '1') {
                right--;
            }

            if (left < right) {
                ans += right - left;
                left++;
                right--;
            }
        }
        
        return ans;
    }
}