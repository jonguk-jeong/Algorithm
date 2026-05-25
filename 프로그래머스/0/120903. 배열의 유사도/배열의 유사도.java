class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for (int c = 0; c < s1.length; c++) {
            for (int r = 0; r < s2.length; r++) {
                if (s1[c].equals(s2[r])) answer++;
            }
        } 
        return answer;
    }
}