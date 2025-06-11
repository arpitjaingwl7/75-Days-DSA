class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        

        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());


        }

     int indegree[]=new int[adj.size()];
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
           adj.get(graph[i][j]).add(i);
             indegree[i]++;
            }
        }


        // topo sort
        
       Queue<Integer>q=new ArrayDeque<>();

        for(int i=0;i<adj.size();i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();

        while(q.size()!=0){
            int temp=q.remove();

            ans.add(temp);

            for(int i:adj.get(temp)){
                 indegree[i]--;
                 if(indegree[i]==0){
                    q.add(i);
                 }
            }
        }


Collections.sort(ans);
return ans;
    }
}