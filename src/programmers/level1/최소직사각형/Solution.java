class Solution {
    public int solution(int[][] sizes) {

        int colmax = 0;
        int colmin = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (colmax < Math.max(sizes[i][0], sizes[i][1])) {
                colmax = Math.max(sizes[i][0], sizes[i][1]);
            }

            if (colmin < Math.min(sizes[i][0], sizes[i][1])) {
                colmin = Math.min(sizes[i][0], sizes[i][1]);
            }
        }

        return (colmax * colmin);

    }
}