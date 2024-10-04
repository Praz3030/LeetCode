class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashMap<Integer, Boolean> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, true);
        }
        
        List<Integer> ans = new ArrayList<>();

        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}