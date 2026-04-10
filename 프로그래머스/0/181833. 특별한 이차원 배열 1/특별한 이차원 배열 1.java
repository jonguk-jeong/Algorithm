class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int c = 0;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                answer[a][b] = 0;
            }
            answer[c][c++] = 1;
        }
        
        return answer;
    }
}