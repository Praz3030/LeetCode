class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n=target.length;

        for(int i=0;i<n;i++){
            int counter=i;
            while(counter<n && target[i]!=arr[counter]){
                counter++;
            }
            if(counter==n){
                return false;
            }
            reverse(arr, i, counter);
        }
        return true;
    }

    private void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}