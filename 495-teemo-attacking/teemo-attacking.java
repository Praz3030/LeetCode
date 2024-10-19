class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        if (timeSeries.length == 0) return 0;
        int ans = 0;
        
        for (int i = 1; i < timeSeries.length; i++) {

            int diff = timeSeries[i] - timeSeries[i - 1];
            ans += Math.min(diff, duration);

        }
        
        ans += duration;
        return ans;
    }
}