class Solution {
    public int orangesRotting(int[][] grid) {

int n=grid.length;
int m=grid[0].length;
int ans=0;

Queue<Pair>q=new ArrayDeque<>();
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(grid[i][j]==2){
            Pair p=new Pair(i,j,0);
            q.add(p);
        }
    }
}

int []dx={1,-1,0,0};
int []dy={0,0,1,-1};

while(q.size()!=0){
    Pair temp=q.remove();
    int x=temp.x;
    int y=temp.y;
    int t=temp.t;
    ans=Math.max(ans,t);

    for(int i=0;i<4;i++){
        int r=x+dx[i];
        int c=y+dy[i];

        if(r>=0&&c>=0&&r<n&&c<m&&grid[r][c]==1){
            grid[r][c]=2;
            q.add(new Pair(r,c,t+1));
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
int x;
int y;
int t;

   Pair(int a, int b,int c){
    x=a;
    y=b;
    t=c;

   }


}