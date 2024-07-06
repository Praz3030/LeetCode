class Solution {
    public int passThePillow(int n, int time) {
        int oneCycle=2*(n-1);
        int temp=time%oneCycle;
        
        if(temp<n){
            return temp+1;
        }
        return n-(temp-(n-1));
    }
}