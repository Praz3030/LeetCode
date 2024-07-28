class Solution {
    public String largestOddNumber(String num) {
        int n=num.length()-1;
        
        for(int i=n;i>=0;i--){
            int temp=num.charAt(i)-'0';
            if(temp%2==0) continue;
            return num.substring(0,i+1);
        }
        return num.substring(0,0);
    }
}