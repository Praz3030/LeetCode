class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }
        
        int limit = 2*n;
        for (int i = 0; i < limit; i++) {

            int index = i % n;
            
            while (!stack.isEmpty() && nums[stack.peek()] < nums[index]) {
                ans[stack.pop()] = nums[index];
            }

            if (i < n) {
                stack.push(index);
            }
        } 
        return ans;
    }
}