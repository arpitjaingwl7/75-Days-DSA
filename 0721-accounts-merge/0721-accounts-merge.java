class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        // Step- Disjopint set bnana hai with the help of accounts and a map

        HashMap<String,Integer>map=new HashMap<>();

        Ds ds=new Ds(accounts.size());

        for(int i=0;i<accounts.size();i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String str=accounts.get(i).get(j);
                if(map.containsKey(str)){
                        ds.union(i,map.get(str));

                }
                else{
                    map.put(str,i);
                }
            }
        }


int n=accounts.size();
        // step-2   ek aise list bnao jiske andar bhut sari list ho. and map ke upar iterate krke har strink ki node value
 
 ArrayList<ArrayList<String>>list=new ArrayList<>();
 for(int i=0;i<n;i++){
    list.add(new ArrayList<>());

 }

 for(String key:map.keySet()){
    list.get(ds.findUp(map.get(key))).add(key);
 }
int c=0;
 for(int i=0;i<n;i++){
if(list.get(i).size()>0){
    c++;
}
    Collections.sort(list.get(i));
 }

 

// step-3 ans bnana hai jisme pehla 

List<List<String>>ans=new ArrayList<>();

for(int i=0;i<c;i++){
    ans.add(new ArrayList<>());
}

int a=0;
for(int i=0;i<n;i++){
    if(list.get(i).size()>0){
        ans.get(a).add(accounts.get(i).get(0));
    
    for(int j=0;j<list.get(i).size();j++){
        ans.get(a).add(list.get(i).get(j));
    }
     a++;
    }
}



return ans;

        
    }
}


class Ds{
int[]par;
int[]rank;

   
   Ds(int n){
    par=new int[n];
    rank=new int[n];
    for(int i=0;i<n;i++){
        par[i]=i;
        rank[i]=1;
    }
   }

   int findUp(int x){
    if(par[x]==x){
        return x;
    }
   return findUp(par[x]);
   } 
   void union(int x,int y){
    int Ux=findUp(x);
    int Uy=findUp(y);


    if(rank[Ux]>rank[Uy]){
        par[Uy]=Ux;

    }
    else if(rank[Ux]<rank[Uy]){
        par[Ux]=Uy;

    }
    else{
        par[Uy]=Ux;
        rank[Ux]++;
    }
   }
}