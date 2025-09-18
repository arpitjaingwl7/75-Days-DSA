class Solution {

    int []dp=new int[46];
    public int climbStairs(int n) {

        if(dp[n]!=0){
            return dp[n];
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
    int a=climbStairs(n-1);
    int b=climbStairs(n-2);
  dp[n]=a+b;
    return dp[n];

    }
}