import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] answer = new String[len];
        
        for (int i = 0; i < len; i++) {
            answer[i] = my_string.substring(len - 1 -i, len);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}

// 어차피 정렬할꺼니까 처음부터 잘라도 됨