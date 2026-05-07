class Solution {
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, n, i);
                answer++;
            }
        }
        
        
        return answer;
    }
    
    public void dfs(int[][] computers, int n, int node) {
        
        visited[node] = true;        
        
        for (int i = 0; i < n; i++) {
            if (computers[node][i] == 1 && visited[i] == false) {
                dfs(computers, n, i);
            }
        }
        
    }
}