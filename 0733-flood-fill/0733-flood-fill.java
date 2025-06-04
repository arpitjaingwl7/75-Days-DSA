class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        Queue<Pair>q=new ArrayDeque<>();
         int n=image.length;
         int m=image[0].length;
        // int[][]vis=new int[m][n];

        int preColor=image[sr][sc];
        if(preColor==color){
            return image;
        }

        
       q.add(new Pair(sr,sc));

       while(q.size()!=0){

        Pair temp=q.remove();

        image[temp.x][temp.y]=color;

        int []dr={0,1,0,-1};
        int []dc={1,0,-1,0};

        for(int i=0;i<4;i++){
            int r=temp.x+dr[i];
            int c=temp.y+dc[i];
            if(r>=0&&c>=0&&r<n&&c<m&&image[r][c]==preColor ){
                q.add(new Pair(r,c));

            }
        }
       }
       return image;

    }

}
class Pair{
    int x;
    int y;
    Pair(int i, int j){
        x=i;
        y=j;
    }
}