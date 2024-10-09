class Solution {
    public String reverseVowels(String s) {
        char[] characters = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = characters.length - 1;
        
        while (left < right) {
            while (left < right && vowels.indexOf(characters[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(characters[right]) == -1) {
                right--;
            }
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        return new String(characters);
    }
}