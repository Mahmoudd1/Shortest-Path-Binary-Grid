import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int path=0;
        if (grid[0][0]!=0)
            return -1;
        Queue<int[]>bfs=new LinkedList<>();
        bfs.add(new int[]{0,0});
        while (bfs.size()>0)
        {
            int size=bfs.size();
            path++;
            while (size-->0)
            {
                int []temp=bfs.poll();
                int a=temp[0];
                int b=temp[1];
                if (a==grid.length-1&&b==grid.length-1)
                {
                    return path;
                }
                if (a>0&& b>0 && grid[a-1][b-1]==0)
                {
                    bfs.add(new int[]{a-1,b-1});
                    grid[a-1][b-1]=1;
                }
                if (a>0 && grid[a-1][b]==0)
                {
                    bfs.add(new int[]{a-1,b});
                    grid[a-1][b]=1;
                }
                if (b>0 && grid[a][b-1]==0)
                {
                    bfs.add(new int[]{a,b-1});
                    grid[a][b-1]=1;
                }
                if (a<grid.length-1&&b<grid.length-1 && grid[a+1][b+1]==0)
                {
                    bfs.add(new int[]{a+1,b+1});
                    grid[a+1][b+1]=1;
                }
                if (a<grid.length-1 && grid[a+1][b]==0)
                {
                    bfs.add(new int[]{a+1,b});
                    grid[a+1][b]=1;
                }
                if (b<grid.length-1 && grid[a][b+1]==0)
                {
                    bfs.add(new int[]{a,b+1});
                    grid[a][b+1]=1;
                }
                if (a<grid.length-1&&b>0 && grid[a+1][b-1]==0)
                {
                    bfs.add(new int[]{a+1,b-1});
                    grid[a+1][b-1]=1;
                }
                if (a>0-1&&b<grid.length-1 && grid[a-1][b+1]==0)
                {
                    bfs.add(new int[]{a-1,b+1});
                    grid[a-1][b+1]=1;
                }
            }
        }
        return -1;
    }
}
