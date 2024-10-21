class Solution {
    public String licenseKeyFormatting(String s, int k) {

        String clear = s.replaceAll("-", "").toUpperCase();
        int len = clear.length() % k;
        StringBuilder converted = new StringBuilder();
        
        if (len > 0) {
            converted.append(clear.substring(0, len));
        }
        
        for (int i = len; i < clear.length(); i += k) {

            if (converted.length() > 0) {
                converted.append("-");
            }
            converted.append(clear.substring(i, i + k));
            
        }
        return converted.toString();
    }
}