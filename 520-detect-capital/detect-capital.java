class Solution {
    public boolean detectCapitalUse(String word) {

        int n = word.length();
        
        if (word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())) {
            return true;
        }

        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        } 
        return false;
    }
}