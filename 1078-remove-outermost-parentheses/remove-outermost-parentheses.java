class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        int d=0;
        
        for(char c:s.toCharArray()){
            if(c=='('){
                if(d>0){
                    ans+=c;
                }
                d++;
            }
            else{
                d--;
                if(d>0){
                    ans+=c;
                }
            }
        }
        return ans;
    }
}