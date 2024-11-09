class Solution {
    public long minEnd(int n, int x) {
        
        long ind = 1;
        long ans = x;
        n -= 1;
        
        while (n > 0) {

            long insertedBit = n & 1;
            n >>= 1;
            
            while ((ind & ans) != 0) {
                ind <<= 1;
            }
            
            ans |= (insertedBit == 1) ? ind : 0;
            ind <<= 1;
        }
        return ans;
    }
}