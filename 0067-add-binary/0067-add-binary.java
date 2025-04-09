class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j= b.length()-1;
    
    String ans="";
     int carry=0;
        while(i>=0||j>=0){
            int num1=i>=0?(a.charAt(i)-'0'):0;
            int num2=j>=0?(b.charAt(j)-'0'):0;
            i--;
            j--;
            int sum= num1+num2+carry;
            int dig=sum%2;
            carry=sum/2;
            ans =dig+ans;


        }
        if(carry>0){
            ans=carry+ans;
        }

        return ans;
    }
}