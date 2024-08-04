class Solution {

    private static final int MOD = 1_000_000_007;

    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Long> sums=new ArrayList<>();
        for(int i=0;i<n;i++){
            long currentSum=0;
            for(int j=i;j<n;j++){
                currentSum+=nums[j];
                sums.add(currentSum);
            }
        }
        
        Collections.sort(sums);

        long result=0;
        for(int i=left-1;i<right;i++){
            result=(result+sums.get(i))%MOD;
        }
        return (int) result;
    }
}