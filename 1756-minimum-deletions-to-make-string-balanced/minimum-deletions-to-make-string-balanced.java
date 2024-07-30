class Solution {
    public int minimumDeletions(String s) {
        int b=0;
        int min=0;

        for(int i=0;i<s.length();++i){
            if(s.charAt(i)=='b'){
                b++;
            }
            else{
                min=Math.min(min+1,b);
            }
        }
        return min;
    }
}