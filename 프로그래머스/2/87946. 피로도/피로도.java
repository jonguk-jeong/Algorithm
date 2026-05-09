class Solution {
    boolean[] visited;
    int answer = -1;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        dfs(k, dungeons, 0);
        
        return answer;
    }
    
    public void dfs(int k, int[][] dungeons, int depth) {
        // 최대값
        answer = Math.max(answer, depth);
        
        // 중간
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, depth + 1);
                visited[i] = false;
            }
        }
    }
}



// i = 0 : a 선택 visited[A]=true
//     bfs 진입
//     i = 0 : 이미 방문되있어서 패스
//     i = 1 : visited[B]=true
//         bfs 진입
//         i = 0 : 이미 방문되있어서 패스
//         i = 1 : 이미 방문되있어서 패스
//         i = 2 : visited[C]=true
//             bfs 진입
//             i = 0, 1, 2 전부 방문 해서 pass
//         visited[C]=false  <- 백트래킹
//     visited[B]=false <- 백트래킹
//     i = 2 : visited[C]=true
//         i = 0 : 이미 방문되있어서 패스
//         i = 1 : visited[B]=true
//             bfs 진입
//             i = 0, 1, 2 전부 방문 해서 pass
//         visited[B]=false
//         i = 2 : 이미 방문되있어서 패스
//     visited[C]=false
// visited[A]=false
// i = 1 : 반복