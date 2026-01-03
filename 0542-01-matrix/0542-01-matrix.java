class Solution {
    public int[][] updateMatrix(int[][] mat) {

 int [][]vis=new int[mat.length][mat[0].length];
       Queue<Pair>q=new ArrayDeque<>();

       for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==0){
                vis[i][j]=1;
                q.add(new Pair(i,j,0));
            }
        }
       } 

       int[] dx={-1,1,0,0};
       int []dy={0,0,-1,1};



       while(q.size()!=0){

        Pair p=q.remove();
        int dis= p.dis;
           
        for(int x=0;x<4;x++){
            int row=p.i+dx[x];
            int col=p.j+dy[x];

            if(row>=0&&col>=0&&row<mat.length&&col<mat[0].length&&vis[row][col]!=1&& mat[row][col]==1){

                 mat[row][col]=dis+1;
                 vis[row][col]=1;

                 q.add(new Pair(row,col,dis+1));

            }

        }


       }
         return mat;
    }
  
}
class Pair{
    
    int i;
    int j;
    int dis;

    Pair(int x,int y,int d){
      
      i=x;
      j=y;
      dis=d;
    }
}