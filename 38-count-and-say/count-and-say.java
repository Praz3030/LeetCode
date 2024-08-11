class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        
        String prev = countAndSay(n - 1);
        String ans = "";
        int len = prev.length();
        
        for (int i = 0; i < len; i++) {
            char curr = prev.charAt(i);
            int count = 1;
            
            while (i + 1 < len && prev.charAt(i + 1) == curr) {
                count++;
                i++;
            }  
            ans += count + "" + curr;
        }
        return ans;
    }
}