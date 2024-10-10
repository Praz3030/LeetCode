class Solution {
    public int maxWidthRamp(int[] nums) {

        int n = nums.length;

        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || nums[i] < nums[stack.peek()]) {
                stack.push(i);
            }
        }
        
        int max = 0;

        for (int j = n - 1; j >= 0; j--) {
            while (!stack.isEmpty() && nums[j] >= nums[stack.peek()]) {

                int i = stack.pop();
                max = Math.max(max, j - i);
            }
        }  
        return max;
    }
}