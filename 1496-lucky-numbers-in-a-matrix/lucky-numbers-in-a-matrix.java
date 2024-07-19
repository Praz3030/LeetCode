class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            int min_num=matrix[i][0];
            int min_index = 0;
            for(int j=1;j<n;j++){
                if(matrix[i][j]<min_num){
                    min_num=matrix[i][j];
                    min_index=j;
                }
            }
            
            boolean lucky=true;
            for(int k=0;k<m;k++){
                if(matrix[k][min_index]>min_num){
                    lucky=false;
                    break;
                }
            }
            if(lucky){
                ans.add(min_num);
            }
        }
        return ans;
    }
}