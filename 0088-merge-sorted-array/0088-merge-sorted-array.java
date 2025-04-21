class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int x=nums1.length-1; 

        int a=m-1;  
        int b=n-1; 



        while(x>=0){
           int n1=a>=0?nums1[a]:Integer.MIN_VALUE;
           int n2=b>=0?nums2[b]:Integer.MIN_VALUE;
             
             if(n1>n2){
                nums1[x]=n1;
                a--;
                x--;

             }
             else{
                nums1[x]=n2;
                b--;
                x--;
             }
             
        }
    }
}