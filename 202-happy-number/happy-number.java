class Solution {
    public boolean isHappy(int n) {
        Set<Integer> nums = new HashSet<>();

        while (n != 1 && !nums.contains(n)) {
            nums.add(n);
            n = calculate(n);
        }

        return n == 1;
    }

    public int calculate(int number) {
        int ans = 0;
        while (number > 0) {
            int digit = number % 10;
            ans += digit * digit;
            number /= 10;
        }
        return ans;
    }
}