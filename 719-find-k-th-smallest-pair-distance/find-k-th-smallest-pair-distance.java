class Solution {
    public int smallestDistancePair(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;

        int left = 0, right = nums[n - 1] - nums[0];

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (countPairs(nums, mid) >= k) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return right;
    }

    private int countPairs(int[] nums, int mid) {
        int count = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            while (nums[right] - nums[left] > mid) {
                left++;
            }
            count += right - left;
        }

        return count;
    }
}