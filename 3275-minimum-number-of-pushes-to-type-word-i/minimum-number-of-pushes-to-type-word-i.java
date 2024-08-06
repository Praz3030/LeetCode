class Solution {
    public int minimumPushes(String word) {
        HashMap <Character , Integer> map = new HashMap<>();
        for(char c : word.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List <Character> chars = new ArrayList<> (map.keySet());
        chars.sort((a, b)->map.get(b)-map.get(a));

        int n=word.length();

        int ans=0;

        for (int i = 0 ; i < n ; i++) {
            int temp = (i/8)+1;

            ans += map.get(chars.get(i)) * temp;
        }
        return ans;
    }
}