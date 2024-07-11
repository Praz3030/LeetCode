class Solution {
    public String reverseParentheses(String s) {
        
        Stack<List<Character>> stack=new Stack<>();

        List<Character> current=new ArrayList<>();
        
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(current);
                current=new ArrayList<>();
            }
            else if(ch==')'){
                reverse(current);
                List<Character> previous=stack.pop();
                previous.addAll(current);
                current=previous;
            }
            else{
                current.add(ch);
            }
        }
        
        StringBuilder result=new StringBuilder();

        for(char ch:current){
            result.append(ch);
        }
        return result.toString();
    }

    public void reverse(List<Character> list){

        int start=0;
        int end=list.size()-1;

        while(start<end){
            char temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
}