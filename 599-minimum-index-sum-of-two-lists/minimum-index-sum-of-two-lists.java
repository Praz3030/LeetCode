class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        
        List<String> ans = new ArrayList<>();

        int minIndexSum = Integer.MAX_VALUE;

        for (int j = 0; j < list2.length; j++) {

            String restaurant = list2[j];

            if (map.containsKey(restaurant)) {

                int indexSum = j + map.get(restaurant);

                if (indexSum < minIndexSum) {
                    ans.clear();
                    ans.add(restaurant);
                    minIndexSum = indexSum;
                }

                else if (indexSum == minIndexSum) {
                    ans.add(restaurant);
                }
            }
        }
        return ans.toArray(new String[0]);
    }
}