class Solution {
    public int countSegments(String s) {

        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        
        String[] split = s.split(" ");
        int count = 0;
        
        for (String segment : split) {
            if (!segment.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}