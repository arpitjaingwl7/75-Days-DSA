class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        

        int []ans=new int [numCourses];
        int n=numCourses;

    ArrayList<ArrayList<Integer>>adj=new ArrayList<>();

    for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());

    }


int indegree[]=new int[n];
    for(int i=0;i<prerequisites.length;i++){
        for(int j=0;j<prerequisites[i].length;j++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
    }
    Queue<Integer>q=new ArrayDeque<>();

for(int i=0;i<n;i++){
    if(indegree[i]==0){
        q.add(i);
    }
}
int c=0;
while(q.size()!=0){
    int temp=q.remove();
    ans[c]=temp;
    c++;

    for(int i:adj.get(temp)){
        indegree[i]--;
        if(indegree[i]==0){
            q.add(i);
        }
    }
}

if(c!=n){
    return new int[0];
}
return ans;

    }
}