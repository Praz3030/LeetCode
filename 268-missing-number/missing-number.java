class Solution {
    public int missingNumber(int[] nums) {
        HashMap <Integer , Integer> map=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }

        for(int j=1;j<=n;j++){
            if(map.containsKey(j)){
                continue;
            }
            return j;
        }
        return 0;
    }
}