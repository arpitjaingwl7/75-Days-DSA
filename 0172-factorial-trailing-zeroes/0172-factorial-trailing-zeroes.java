class Solution {
    public int trailingZeroes(int n) {


       int ans=0;
       int a=5;

       while(a<=n){
        ans+= (n/a);
        a=a*5;
       } 
       return ans;
    }
}