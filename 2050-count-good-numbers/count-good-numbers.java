class Solution {
    private long mod=1000000007;

    public long power(long x, long n){
        if(n==0){
            return 1;
        }
        long temp=power(x,n/2);
        if(n%2==0){
            return (temp*temp)%mod;
        }
        else{
            return (x*temp*temp)%mod;
        }
    }

    public int countGoodNumbers(long n) {
        long odd=n/2;
        long even=(n+1)/2;

        long even_count=power(5,even)%mod;
        long odd_count=power(4,odd)%mod;

        return (int)((even_count*odd_count)%mod);

    }
}