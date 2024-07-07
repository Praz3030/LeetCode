class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottles=numBottles;

        while(numExchange<=emptyBottles){
            numBottles=numBottles+(emptyBottles/numExchange);
            emptyBottles=emptyBottles-((emptyBottles-(emptyBottles/numExchange)))+emptyBottles%numExchange;
        }
        return numBottles;
    }
}