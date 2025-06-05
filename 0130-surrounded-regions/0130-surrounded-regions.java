class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][]vis=new int[n][m];


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if((i==0||j==0||i==n-1||j==m-1)&& board[i][j]=='O'&&vis[i][j]==0){

                    dfs(board,vis,i,j,n,m);

                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

               if(vis[i][j]==0&&board[i][j]=='O'){
                board[i][j]='X';
               }
            }
        }


    }
    void dfs(char[][]board,int[][]vis,int i,int j,int n,int m){
    
        vis[i][j]=1;

        int []dx={1,-1,0,0};
        int[]dy={0,0,1,-1};

        for(int l=0;l<4;l++){
           int r=i+dx[l];
            int c=j+dy[l];

            if(r>=0&&c>=0&&r<n&&c<m&&board[r][c]=='O'&& vis[r][c]==0){
                dfs(board,vis,r,c,n,m);
            }
        }




    }
}