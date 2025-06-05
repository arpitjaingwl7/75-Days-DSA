class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][]vis=new int[n][m];
         Queue<Pair>q=new ArrayDeque<>();


       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if((i==0||j==0||i==n-1||j==m-1)&& board[i][j]=='O'&&vis[i][j]==0){

                    vis[i][j]=1;
                    q.add(new Pair(i,j));


                }
            }
        }
        while(q.size()!=0){
            Pair temp=q.remove();
            int dx[]={0,0,-1,1};
            int dy[]={1,-1,0,0};

            for(int i=0;i<4;i++){
                int r=temp.x+dx[i];
                int c=temp.y+dy[i];

                if(r>=0 && c>=0 && r<n && c<m && vis[r][c]==0 && board[r][c]=='O'){
                    vis[r][c]=1;
                    q.add(new Pair(r,c));
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

}
class Pair{
int x;
int y;
Pair(int i,int j){
    x=i;
    y=j;
}
}