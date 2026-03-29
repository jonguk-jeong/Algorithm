class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        int len = (int) Math.ceil((double) my_string.length() / m);
        for (int i=0; i < len; i++) {
            answer += my_string.substring(c-1 + m*i, c + m*i);
        }
        
        return answer;
    }
}