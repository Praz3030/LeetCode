class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        TreeMap<Long, List<Integer>> mp = new TreeMap<>();
        
        for (int num : nums) {
            List<Integer> temp = new ArrayList<>();
            int x = num;
            if (x == 0) {
                long mappedValue = mapping[x];
                if (!mp.containsKey(mappedValue)) {
                    mp.put(mappedValue, new ArrayList<>());
                }
                mp.get(mappedValue).add(x);
                continue;
            }
            while (x > 0) {
                temp.add(x % 10);
                x /= 10;
            }
            long mappedNum = 0;
            for (int j = temp.size() - 1; j >= 0; j--) {
                mappedNum = mappedNum * 10 + mapping[temp.get(j)];
            }
            if (!mp.containsKey(mappedNum)) {
                mp.put(mappedNum, new ArrayList<>());
            }
            mp.get(mappedNum).add(num);
        }

        List<Integer> ans = new ArrayList<>();
        for (List<Integer> list : mp.values()) {
            ans.addAll(list);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}