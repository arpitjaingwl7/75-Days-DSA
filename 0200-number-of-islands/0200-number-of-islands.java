class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        int n=grid.length;
        int m=grid[0].length;
        int [][]vis=new int[n][m];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(vis[i][j]==0 && grid[i][j]=='1'){
                  c++;

                 dfs(grid,i,j,vis,n,m);
                }
            }
        }

return c;
    }

    void dfs(char[][] grid,int row, int col, int[][]vis,int n,int m){


        int []dr={1,-1,0,0};
        int[] dc={0,0,1,-1};


        for(int i=0;i<4;i++){
            
            int r=row+dr[i];
            int c=col+dc[i];

            if(r>=0&&c>=0&&r<n&&c<m&& vis[r][c]==0&&grid[r][c]=='1'){
                vis[r][c]=1;
                dfs(grid,r,c,vis,n,m);
            }
        }
    }
}