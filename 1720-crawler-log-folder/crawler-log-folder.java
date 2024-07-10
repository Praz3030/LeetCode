class Solution {
    public int minOperations(String[] logs) {
        int ans=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].contains("../")){
                if(ans>0){
                    ans--;
                    continue;
                }
            }
            if(logs[i].contains("./")){
                continue;
            }
            if(logs[i].contains("/")){
                ans++;
            }
        }
        return ans;
    }
}