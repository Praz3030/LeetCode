class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum = 0;
        for (int num : nums) {
            sum = (sum + num) % p;
        }
        
        if (sum == 0) {
            return 0;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixSum = 0;
        int len = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum = (prefixSum + nums[i]) % p;
            int k = (prefixSum - sum + p) % p;
            
            if (map.containsKey(k)) {
                len = Math.min(len, i - map.get(k));
            }
            
            map.put(prefixSum, i);
        }
        return len == nums.length ? -1 : len;
    }
}