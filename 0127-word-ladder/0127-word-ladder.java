class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        

        Queue<Pair>q=new ArrayDeque<>();

 q.add(new Pair(beginWord,1));
        HashSet<String>set=new HashSet<>();

        for(String s:wordList){
            if(!(s.equals(beginWord))){
            set.add(s);

            }
        }

        
        
        while(q.size()!=0){
            Pair p=q.remove();
            if(p.str.equals(endWord)){
                return p.time;
            }
            String str=p.str;

            int n=str.length();

            

            for(int i=0;i<n;i++){
                for(int j=0;j<26;j++){
                    char ch=(char)(j+'a');

                    String temp=changeChar(str,i,ch);

                    if(set.contains(temp)){
                        q.add(new Pair(temp,p.time+1));
                        set.remove(temp);
                    }
                }
            }
        }


return 0;

    }

    String changeChar(String str, int x, char ch){

        String ans="";
        for(int i=0;i<str.length();i++){

            if(i==x){
                ans+=ch;
            }
            else{
                ans+=str.charAt(i);
            }
        }

        return ans;
    }
}
class Pair{
    String str;
    int time;
    Pair(String s,int t){
        str=s;
        time=t;
    }
}