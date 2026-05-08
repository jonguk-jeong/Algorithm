class Solution {
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, i, n);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int[][] computers, int node, int n) {
        visited[node] = true;
        
        for (int i = 0; i < n; i++) {
            if (computers[node][i] == 1 && !visited[i]) {
                dfs(computers, i, n);
            }
        }
    }
}