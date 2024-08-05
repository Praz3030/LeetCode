class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap <String, Integer >map = new HashMap<>();
        for(String s : arr) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List <String> ans = new ArrayList<>();
        for(String s : arr) {
            if(map.get(s)==1){
                if(!ans.contains(s)){
                    ans.add(s);
                }
            }
        }
        if(k<=ans.size()) return ans.get(k-1);

        return "";
    }
}