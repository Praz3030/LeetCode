class Solution {
    public int[] constructRectangle(int area) {
        int wid=(int)Math.sqrt(area);
        while(area%wid!=0){
            wid--;
        }
        return new int[]{area/wid,wid};
    }
}