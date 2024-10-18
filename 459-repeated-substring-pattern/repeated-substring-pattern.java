class Solution {
    public boolean repeatedSubstringPattern(String s) {

       int n = s.length();
        
        for (int len = 1; len <= n / 2; len++) {

            if (n % len == 0) {
                
                String temp = s.substring(0, len);
                StringBuilder repeat_string = new StringBuilder();
                
                int count = n / len;

                for (int i = 0; i < count; i++) {

                    repeat_string.append(temp);

                }
                
                if (repeat_string.toString().equals(s)) {

                    return true;

                }
            }
        }
        return false; 
    }
}