class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans=0;
        int temp=0;
        int dif=0;

        for(int i=0;i<cost.length;i++){
            temp+=(gas[i]-cost[i]);
            dif+=(gas[i]-cost[i]);

            if(temp<0){
                temp=0;
                ans=i+1;
            }
        }
        if(ans>=gas.length || dif<0){
            return -1;
        }
        return ans;
    }
}