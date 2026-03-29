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

// 이게 더 간단할 듯??

// for (int i = c - 1; i < my_string.length(); i += m) {
//     answer += my_string.charAt(i);
// }