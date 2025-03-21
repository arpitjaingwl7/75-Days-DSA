class Solution {
    public boolean backspaceCompare(String s, String t) {
        
     String s1=resultantString(s);
     String s2=resultantString(t);


     return s1.equals(s2);
     


     }

          
    
    public  String resultantString(String s){

      Stack<Character>st=new Stack<>();

     for(int i=0;i<s.length();i++){
        
        char ch=s.charAt(i);

        if(ch!='#'){
            st.push(ch);
        }
        else{
            if(st.size()!=0){
                st.pop();
            }
        }
     }
        String ans="";

        while(st.size()!=0){
            ans+=st.pop();
        }

        return ans;
    }
}