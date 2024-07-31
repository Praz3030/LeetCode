class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Character> chars=new ArrayList<>(map.keySet());
        chars.sort((a, b)->map.get(b)-map.get(a));
        
        String ans="";

        for(char c:chars){
            int n=map.get(c);
            for(int i=0;i<n;i++){
                ans+=c;
            }
        }
        return ans;
    }
}