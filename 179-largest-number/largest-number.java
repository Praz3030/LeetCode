import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {
        Integer[] numsArray = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsArray[i] = nums[i];
        }
        Arrays.sort(numsArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                String str1 = String.valueOf(num1);
                String str2 = String.valueOf(num2);
                return (str2 + str1).compareTo(str1 + str2);
            }
        });
        if (numsArray[0] == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : numsArray) {
            sb.append(num);
        }
        return sb.toString();
    }

}
