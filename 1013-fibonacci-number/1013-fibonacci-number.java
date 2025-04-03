class Solution {
    public int fib(int n) {
       
    //    Base condn
       if(n==0){
        return 0;
       }
       if(n==1){
        return 1;
       }


// recursive calls
      int a=fib(n-1);
       int b=fib(n-2);

// Easiest task
       return a+b;


    }

}