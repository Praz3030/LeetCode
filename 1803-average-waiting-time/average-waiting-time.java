class Solution {
    public double averageWaitingTime(int[][] customers) {
        long waiting_time=0;
        int chef_time=0;
        int order_complete=0;

        for(int i=0;i<customers.length;i++){

            int arrival=customers[i][0];
            int cooking_time=customers[i][1];

            chef_time=Math.max(chef_time,arrival);
            order_complete=chef_time+cooking_time;
            waiting_time+=(order_complete-arrival);

            chef_time=order_complete;

        }
        return (double)waiting_time/customers.length;
        
    }
}