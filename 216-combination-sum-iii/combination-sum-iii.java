class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        
        backtrack(ans, new ArrayList<>(), set, k, n, 1);
        
        return ans;
    }

    public void backtrack(List<List<Integer>> ans, List<Integer> tempList, Set<List<Integer>> set, int k, int remain, int start){

        if(tempList.size()==k && remain==0){
            if(set.add(new ArrayList<>(tempList))){
                ans.add(new ArrayList<>(tempList));
            }
            return;
        }

        if(tempList.size()>k || remain<0){
            return;
        }

        for(int i=start;i<=9;i++){
            tempList.add(i);
            backtrack(ans, tempList, set, k, remain-i, i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}