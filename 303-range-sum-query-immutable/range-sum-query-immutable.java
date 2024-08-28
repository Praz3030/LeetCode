class NumArray {

    int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length];
        sum[0] = nums[0];
        int n = nums.length;

        for(int i = 1; i < n; i++) {
            sum[i] = nums[i] + sum[i - 1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left > 0) return sum[right] - sum[left - 1];

        else return sum[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */