class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        ans.add(new ArrayList<>());
        set.add(new ArrayList<>());
        int len=nums.length;

        for(int i=0;i<len;i++){
            int n=ans.size();
            for(int j=0;j<n;j++){
                List<Integer> temp=new ArrayList<>(ans.get(j));
                temp.add(nums[i]);
                if(!set.contains(temp)){
                    set.add(temp);
                    ans.add(temp);
                }
            }
           
        }
        return ans;
    }
}