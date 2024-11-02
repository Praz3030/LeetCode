class Solution {
    public boolean isCircularSentence(String sentence) {

        String[] words = sentence.split(" ");
        
        for (int i = 0; i < words.length; i++) {

            char last = words[i].charAt(words[i].length() - 1);

            char next = words[(i + 1) % words.length].charAt(0);
            
            if (last != next) {
                return false;
            }

        }
        return true;
    }
}