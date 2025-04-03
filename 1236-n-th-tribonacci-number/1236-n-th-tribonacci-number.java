class Solution {
    int []arr=new int[38];
    
    public int tribonacci(int n) {
        
        if(arr[n]!=0){
            return arr[n];
        }
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }

        int a= tribonacci(n-1);
        int b=tribonacci(n-2);
        int c=tribonacci(n-3);
       arr[n]=a+b+c;

        return a+b+c;
    }
}