class Solution {
    public int maximumGain(String s, int x, int y) {
        char a='a';
        char b='b';

        if(x<y){
            int temp=x;
            x=y;
            y=temp;
            char temp1=a;
            a=b;
            b=temp1;
        }

        int n=s.length();
        int ans=0;
        int count=0;
        int count1=0;

        for(int i=0;i<n;++i){
            char temp=s.charAt(i);
            if(temp==a){
                count++;
            }
            else if(temp==b){
                if(count>0){
                    ans+=x;
                    count--;
                }
                else{
                    count1++;
                }
            }
            else{
                ans+=Math.min(count,count1)*y;
                count=0;
                count1=0;
            }
        }
        
        ans+=Math.min(count,count1)*y;
        return ans;
    }
}