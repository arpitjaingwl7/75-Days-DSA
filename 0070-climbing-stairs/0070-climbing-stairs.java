class Solution {

    int []dp=new int[46];

    public int climbStairs(int n) {
        // base case
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(dp[n]!=0){
            return dp[n];
        }

        // Rec Call
        int a=climbStairs(n-1);
        int b=climbStairs(n-2);

        // Some work
        dp[n]=a+b;
        return dp[n];
    }
}