class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

      List<Integer> list = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            if (cal(i)) {
                list.add(i);
            }
        }
        return list;
    }
    
    private boolean cal(int num) {

        int temp = num;
        
        while (temp > 0) {

            int n = temp % 10;

            if (n == 0 || num % n != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}