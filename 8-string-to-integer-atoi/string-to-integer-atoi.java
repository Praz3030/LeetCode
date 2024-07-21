class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int index=0;
        int ans=0;
        int sign=1;

        while(index<n && s.charAt(index)==' '){
            index++;
        }

        if(index<n && (s.charAt(index)=='-' || s.charAt(index)=='+')){
            if(s.charAt(index)=='-'){
                sign=-1;
            }
            index++;
        }

        while(index<n && Character.isDigit(s.charAt(index))){
            int curr=s.charAt(index)-'0';

            if(ans>(Integer.MAX_VALUE-curr)/10){
                if(sign==1){
                    return Integer.MAX_VALUE;
                }
                else{
                    return Integer.MIN_VALUE;
                }
            }
            ans=ans*10+curr;
            index++;
        }

        return ans*sign;
    }
}