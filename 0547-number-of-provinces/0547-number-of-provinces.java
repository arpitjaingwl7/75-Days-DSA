class Solution {
    public int findCircleNum(int[][] isConnected) {


   // 

   ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
 int n=isConnected.length;
 int m=isConnected[0].length;
   for(int i=0;i<isConnected.length;i++){
    adj.add(new ArrayList<>());

   }

   for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(isConnected[i][j]==1 && i!=j){
          adj.get(i).add(j);
          adj.get(j).add(i);
        }
    }
   }

   int count=0;
   int []vis=new int [n];

for(int i=0;i<n;i++){
    if(vis[i]!=1){
        count++;
        vis[i]=1;
        dfs(adj,vis,i);
    }
}
return count;

   
    }
void dfs(ArrayList<ArrayList<Integer>>adj,int[]vis,int x){

    vis[x]=1;

    for(int i:adj.get(x)){
        if(vis[i]!=1){
            vis[i]=1;
            dfs(adj,vis,i);
        }
    }
}
}

