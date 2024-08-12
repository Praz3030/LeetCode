class Solution {
    public int repeatedStringMatch(String a, String b) {
        int len_a = a.length();
        int len_b = b.length();
        
        int count = (len_b + len_a - 1) / len_a;
        
        String repeat = new String(new char[count]).replace("\0", a);
        
        if (repeat.contains(b)) {
            return count;
        }
        
        repeat += a;
        if (repeat.contains(b)) {
            return count + 1;
        }
        
        return -1;
    }
}