class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int limit = n / 2;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }

        if(set.size() > limit) return limit;

        return set.size();
    }
}