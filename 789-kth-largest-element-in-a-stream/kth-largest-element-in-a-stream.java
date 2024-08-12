class KthLargest {

    private int k;
    private List<Integer> topK;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.topK = new ArrayList<>();

        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        topK.add(val);
        
        Collections.sort(topK, Collections.reverseOrder());
        
        if (topK.size() > k) {
            topK.remove(topK.size() - 1);
        }
        
        return topK.get(topK.size() - 1);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */