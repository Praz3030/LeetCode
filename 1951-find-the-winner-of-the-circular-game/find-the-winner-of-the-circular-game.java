class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            temp.add(i+1);
        }
        int ind=0;
        while(temp.size()>1){
            ind=(ind+k-1)%temp.size();
            temp.remove(ind);
        }
        return temp.get(0);
    }
}
