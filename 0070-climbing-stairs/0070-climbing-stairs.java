class Solution {
    int []arr=new int[46];


    public int climbStairs(int n) {

      if(arr[n]!=0){
        return arr[n];
      }
        // Base cond

        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
    
    arr[n]=climbStairs(n-1)+climbStairs(n-2);

        return  arr[n];
    }
}