class Solution {
    public List<String> buildArray(int[] target, int n) {
        int len = target.length;
        List <String> list = new ArrayList<>();
        int index = 0;

        for (int i = 1 ; i <= n ; i++) {
            if (i == target[index]){
                list.add("Push");
                index++;
            }
            else {
                list.add("Push");
                list.add("Pop");
            }
            if ( index == len ) break;
        }
        return list;
    }
}