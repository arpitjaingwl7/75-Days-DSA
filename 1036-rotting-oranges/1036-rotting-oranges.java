class Solution {
    public int orangesRotting(int[][] grid) {


  int n=grid.length;

  int m= grid[0].length;
  int max=0;



Queue<Pair>q=new ArrayDeque<>();

  int[][]vis=new int [m][n];

  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){

        if(grid[i][j]==2){
            q.add(new Pair(i,j,0));
        }
    }
  }

while(q.size()!=0){
 
 Pair temp=q.remove();

 int []dx={-1,1,0,0};
 int[] dy={0,0,-1,1};

 for(int k=0;k<4;k++){
    int r=temp.i+dx[k];
    int c=temp.j+dy[k];

    max=Math.max(max,temp.t);

    if(r<n&& c<m&& r>=0&& c>=0&& grid[r][c]==1 ){

        grid[r][c]=2;
        q.add(new Pair(r,c,temp.t+1));


    }
 }

}


for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(grid[i][j]==1){
            return -1;
        }
    }

   
}
 return max;
     
    }
}
class Pair{
    int i;
    int j;
    int t;
    Pair(int a,int b,int c){
        i=a;
        j=b;
        t=c;
    }
}