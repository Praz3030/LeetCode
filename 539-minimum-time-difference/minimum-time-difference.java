class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();
        for (String time : timePoints) {

            String[] parts = time.split(":");

            int hours = Integer.parseInt(parts[0]);

            int mins = Integer.parseInt(parts[1]);

            minutes.add(hours * 60 + mins);

        }
        
        Collections.sort(minutes);
        
        int ans = Integer.MAX_VALUE;
        int n = minutes.size();
        
        for (int i = 1; i < n; i++) {

            ans = Math.min(ans, minutes.get(i) - minutes.get(i - 1));

        }
        
        ans = Math.min(ans, (24 * 60 - minutes.get(n - 1) + minutes.get(0)));
        
        return ans;
    }
}