import java.util.*;

class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        int answer = bfs(maps, 0, 0);
        
        return answer;
    }
    
    public int bfs(int[][] maps, int startX, int startY) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] dist = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        dist[0][0] = 1;
        
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[] {startX ,startY});
        visited[startX][startY] = true;
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny]) continue;
                if (maps[nx][ny] == 0) continue;
                
                visited[nx][ny] = true;
                dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
                q.offer(new int[] {nx, ny});
                
            }
        }
        
        return visited[n-1][m-1] ? dist[n-1][m-1] : -1;
    }
}