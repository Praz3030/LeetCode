class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int max=Math.max(len1,len2);
        String ans="";

        for(int i=0;i<max;i++){
            if(i<len1){
                ans+=word1.charAt(i);
            }
            if(i<len2){
                ans+=word2.charAt(i);
            }
        }
        return ans;
    }
}