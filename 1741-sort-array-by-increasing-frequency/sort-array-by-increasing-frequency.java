class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> keys=new ArrayList<>(map.keySet());

        keys.sort((a,b)->{
            int A=map.get(a);
            int B=map.get(b);
            if (A!=B){
                return A-B;
            }
            else{
                return b-a;
            }
        });

        int ans[]=new int[nums.length];
        int count=0;

        for(int key:keys){
            int frequency=map.get(key);
            for(int j=0;j<frequency;j++){
                ans[count++]=key;
            }
        }
        return ans;
    }
}