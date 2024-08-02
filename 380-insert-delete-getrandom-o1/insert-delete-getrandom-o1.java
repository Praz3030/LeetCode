class RandomizedSet {

    private List<Integer> list;
    private Map<Integer,Integer>map;
    private Random randInt;

    public RandomizedSet() {
        list=new ArrayList();
        map=new HashMap<>();
        randInt=new Random();
        
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int len=list.get(list.size()-1);
        int ind=map.get(val);

        list.set(ind,len);
        map.put(len,ind);

        list.remove(list.size()-1);
        map.remove(val);
        return true;
        
    }
    
    public int getRandom() {
        int randInd=randInt.nextInt(list.size());
        return list.get(randInd);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */