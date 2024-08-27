class Solution {
    public int firstUniqChar(String s) {

        Queue<Character> queue = new LinkedList<>();
        int[] freq = new int[26];
        int n = s.length();
        int index = -1;

        for(int i = 0 ; i < n ; i++) {
            char c = s.charAt(i);
            queue.add(c);
            freq[c - 'a']++;

            while(!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.remove();
            }
        }
        return queue.isEmpty() ? -1 : s.indexOf(queue.peek());
    }
}