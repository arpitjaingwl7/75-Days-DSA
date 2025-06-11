class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
     
     int n=numCourses;

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());

        }

        int indegree[]=new int[adj.size()];
        Queue<Integer>q=new ArrayDeque<>();

        for(int []i:prerequisites){
     
           indegree[i[0]]++;
            adj.get(i[1]).add(i[0]);

    
        }

        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

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

return ans.size()==n;
    }
}