class Solution {
    public int maximumSwap(int num) {
        
        char[] nums = Integer.toString(num).toCharArray();
        
        int n = nums.length;
        
        int[] index = new int[n];

        index[n - 1] = n - 1;
        
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[index[i + 1]]) {
                index[i] = i;
            }
            else {
                index[i] = index[i + 1];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[index[i]]) {
                char temp = nums[i];
                nums[i] = nums[index[i]];
                nums[index[i]] = temp;
                return Integer.parseInt(new String(nums));
            }
        }
        return num;
    }
}