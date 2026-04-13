class Solution {
    public int[][] solution(int[][] arr) {
        int n = Math.max(arr.length, arr[0].length);
                
        int[][] answer = new int[n][n];
        
        if (n == arr.length) {
            for (int c = 0; c < n; c++) {
                for (int r = 0; r < n; r++) {
                    if (r >= arr[0].length) {
                        answer[c][r] = 0;
                    } else {
                        answer[c][r] = arr[c][r];
                    }
                }
            }
        } else {
            for (int r = 0; r< n; r++) {
                for (int c = 0; c < n; c++) {
                    if (c >= arr.length) {
                        answer[c][r] = 0;
                    } else {
                        answer[c][r] = arr[c][r];
                    }
                }
            }
        }
        
        return answer;
    }
}