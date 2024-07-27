class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        combinations(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }

    public void combinations(int index, int nums[], int target, List<Integer> list, List<List<Integer>>ans){
        if(index==nums.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(nums[index]<=target){
            list.add(nums[index]);
            combinations(index, nums, target-nums[index], list, ans);
            list.remove(list.size()-1);
        }
        combinations(index+1, nums, target, list, ans);
    }
}