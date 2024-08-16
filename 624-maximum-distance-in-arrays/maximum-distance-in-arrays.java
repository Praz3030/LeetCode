class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int ans = 0;

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            int currentMin = array.get(0);
            int currentMax = array.get(array.size() - 1);

            ans = Math.max(ans, Math.abs(currentMax - min));
            ans = Math.max(ans, Math.abs(max - currentMin));

            min = Math.min(min, currentMin);
            max = Math.max(max, currentMax);
        }

        return ans;
    }
}