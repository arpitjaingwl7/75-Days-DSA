class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
  int n1=nums1.length;
int n2=nums2.length;
int []res= new int[n1+n2];
int p1=0;
int p2=0;
int p3=0;


while(p1<n1 && p2<n2){
if(nums1[p1]<nums2[p2]){

    res[p3]=nums1[p1];
    p1++;
    p3++;
}
else{
     res[p3]=nums2[p2];
    p2++;
    p3++;


}



}

if(p1==n1){

    while(p2<n2){

         res[p3]=nums2[p2];
    p2++;
    p3++;


    }

}
else if(p2==n2){

     while(p1<n1){

         res[p3]=nums1[p1];
    p1++;
    p3++;


    }


}

double ans=0;

if((n1+n2)%2!=0){
 ans=res[(n1+n2-1)/2];

}
else{
    ans= (double)(res[(n1+n2-1)/2]    + res[(((n1+n2-1)/2)+1)])/2;
}


      return ans;  
    }
}