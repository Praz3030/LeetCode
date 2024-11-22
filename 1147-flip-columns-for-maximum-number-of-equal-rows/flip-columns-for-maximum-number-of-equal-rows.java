class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {

        HashMap<String, Integer> map = new HashMap<>();
        int ans = 0;

        for (int[] i : matrix) {
            
            int[] normal = new int[i.length];
            int[] complement = new int[i.length];
            
            for (int j = 0; j < i.length; j++) {
                normal[j] = i[j] ^ i[0];
                complement[j] = 1 - normal[j];
            }

            String pattern = Arrays.toString(normal);
            map.put(pattern, map.getOrDefault(pattern, 0) + 1);
            ans = Math.max(ans, map.get(pattern));
        }
        return ans;
    }
}