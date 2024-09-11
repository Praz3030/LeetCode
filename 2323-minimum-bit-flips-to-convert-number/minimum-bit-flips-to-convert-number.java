class Solution {
    public int minBitFlips(int start, int goal) {

        int difference = start ^ goal;

        int flip = 0;

        while (difference > 0) {

            flip += (difference & 1);
            difference >>= 1;
            
        }
        return flip;
    }
}