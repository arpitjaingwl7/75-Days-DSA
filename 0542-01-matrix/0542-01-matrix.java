class Solution {
    public int[][] updateMatrix(int[][] mat) {
      
      int m=mat.length;
      int n=mat[0].length;
      int [][]vis=new int [m][n];
       Queue<Pair>q=new ArrayDeque<>();
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){

            if(mat[i][j]==0){
                vis[i][j]=1;
                q.add(new Pair(i,j,0));
            }
        }
       } 
       
       while(q.size()!=0){
        Pair temp=q.remove();

       int []dx={1,-1,0,0};
       int[]dy={0,0,-1,1};

       for(int i=0;i<4;i++){
        int r=temp.x+dx[i];
        int c=temp.y+dy[i];

        if(r>=0 && c>=0 && r<m && c<n && vis[r][c]==0 ){
            vis[r][c]=1;
            mat[r][c]=temp.t+1;
            q.add(new Pair(r,c,temp.t+1));
                    
        }
       }

       }
       return mat;
    }
}
class Pair{
    int x;
    int y;
    int t;
    Pair(int i,int j,int k){
        x=i;
        y=j;
        t=k;
    }
}