class Solution {
    public int orangesRotting(int[][] grid) {



int ans=0;

Queue<Pair>q=new ArrayDeque<>();
int n=grid.length;
int m=grid[0].length;
int [][]vis=new int[n][m];

for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(grid[i][j]==2){
            Pair p=new Pair(i,j,0);
            q.add(p);
        }
    }
}

while(q.size()!=0){
    Pair p=q.remove();
    int row=p.i;
    int col=p.j;
    int t=p.time;

int[] dx={0,0,1,-1};
int []dy={1,-1,0,0};

for(int i=0;i<4;i++){
    int r=row+dx[i];
    int c=col+dy[i];

    if(r>=0&& c>=0&& r<n&& c<m&&grid[r][c]==1){
        grid[r][c]=2;
        Pair newPair=new Pair(r,c,t+1);
        ans=Math.max(ans,t+1);
        q.add(newPair);
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

return ans;

    }


}

class Pair{
    int i;
    int j;
    int time;

    Pair(int x,int y,int t){
        i=x;
        j=y;
        time=t;
    }

}