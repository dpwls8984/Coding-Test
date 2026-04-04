import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;        
        int m = maps[0].length;
        
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        boolean visited[][] = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0]; //x
            int y = current[1]; //y
            int cnt = current[2]; //지금까지 이동 횟수
            
            if(x == n-1 && y == m-1){
                return cnt;
            }
            
            for(int d = 0;d<4;d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny]==1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, cnt+1});
                }
            }
        }
        
        
        return -1;
    }
}