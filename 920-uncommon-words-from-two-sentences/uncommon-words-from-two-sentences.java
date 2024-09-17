class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        int start = 0;

        String[] temp = s1.split("\\s");
        String[] temp1 = s2.split("\\s");

        int n = temp.length;

        int n1 = temp1.length;

        HashMap<String,Integer>map = new HashMap<>();

        for (String word : temp) { 
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for (String word : temp1) { 
            map.put(word,map.getOrDefault(word,0)+1);
        }

        List <String>ans = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans.add(entry.getKey());
            }
        }
        return ans.toArray(new String[0]);

        
    }
}