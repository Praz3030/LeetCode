class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int ans = Integer.MAX_VALUE;
        sort_nums(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int curr = nums[i] + nums[left] + nums[right];
                
                if (Math.abs(curr - target) < Math.abs(ans - target)) {
                    ans = curr;
                }
                
                if (curr < target) {
                    left++;
                }
                else if (curr > target) {
                    right--;
                }
                else {
                    return curr;
                }
            }
        }
        return ans;
    }

    public void sort_nums(int[] nums) {
        int n = 5 * (int) 1e4;
        int m = 2 * n + 1;

        int[] count = new int[m];

        for(int x : nums) {
            count[x + n]++;
        }

        int k = 0;

        for(int i = 0; i < m; i++) {
            int temp = count[i];
            while(temp --> 0)
            nums[k++] = i - n;
        }
    }
}