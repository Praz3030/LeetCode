class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits==null || digits.length()==0){
            return ans;
        }

        String letters[]=new String[] {"","","abc","def","ghi","jkl","mno",
"pqrs","tuv","wxyz"};

        Queue<String> queue= new LinkedList<>();
        queue.add("");

        for(char digit:digits.toCharArray()){
            String letter=letters[digit-'0'];
            int size=queue.size();
            for(int i=0;i<size;i++){
                String curr=queue.poll();
                for(char temp:letter.toCharArray()){
                    queue.add(curr+temp);
                }
            }
        }
        ans.addAll(queue);
        return ans;
    }
}