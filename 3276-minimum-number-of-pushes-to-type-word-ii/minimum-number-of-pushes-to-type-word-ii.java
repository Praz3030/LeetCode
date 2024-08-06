class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : word.toCharArray()) {
            map.put(ch,map.getOrDefault(ch, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> temp = new ArrayList<>(map.entrySet());
        temp.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int ans = 0;
        int key = 1;
        int n = temp.size();
        for (int i = 0; i < n; i++) {
            if (i > 0 && i % 8 == 0) {
                key++;
            }
            ans += key * temp.get(i).getValue();
        }
        
        return ans;
    }
}