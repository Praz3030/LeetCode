class Solution {
    public int findTheWinner(int n, int k) {
        int ind=0;
        for(int i=1;i<=n;i++){
            ind=(ind+k)%i;
        }
        return ind+1;
    }
}