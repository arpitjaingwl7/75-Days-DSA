class Solution {
    public int swimInWater(int[][] grid) {
        int min=0;
        int max=50*50;
        int ans=Integer.MAX_VALUE;

        while(max>=min){

            int mid=(max+min)/2;
          
          if(isReachable(grid,mid)){
            ans=mid;

            max=mid-1;
          }
          else{
            min=mid+1;
          }




        }
        return ans;
    }

    boolean isReachable(int[][] grid,int x){
   
     int n=grid.length;
     int m=grid[0].length;

     int [][]vis=new int [n][m];

     int []dx={0,0,1,-1};
     int []dy={1,-1,0,0};
     Queue<Pair>q=new ArrayDeque<>();

     q.add(new Pair(0,0));
vis[0][0]=1;
     while(q.size()!=0){
        
        Pair temp=q.remove();

        int row=temp.x;
        int col=temp.y;

        if(grid[row][col]>x){
            return false;
        }
        if(row==n-1 && col==m-1){
            return true;
        }

        for(int i=0;i<4;i++){
            int r=temp.x+dx[i];
            int c=temp.y+dy[i];

            if(r>=0&&c>=0&& r<n&& c<m&& vis[r][c]==0 && grid[r][c]<=x){
                vis[r][c]=1;
                q.add(new Pair(r,c));
            }
        }
     }
      return false;

    }
}
class Pair{
    int x;
    int y;

    Pair(int a,int b){
        x=a;
        y=b;
    }
}