class Solution {
    public int solution(int[][] arr) {
        for (int c = 0; c < arr.length; c++) {
            for (int r = 0; r < arr.length; r++) {
                if (arr[c][r] != arr[r][c]) return 0;
            }
        }
        return 1;
    }
}

// int r = c 하는게 더 이득임