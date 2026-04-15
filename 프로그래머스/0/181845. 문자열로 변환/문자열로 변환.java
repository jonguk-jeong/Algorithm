import java.util.*;

class Solution {
    public String solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        String answer = "";
        
        while(n > 10) {
            int r = n%10;
            list.add(r);
            n /= 10;
        }
        list.add(n);
        
        for (int i = list.size() - 1; i >= 0; i--) {
            answer += list.get(i);
        }
        
        return answer;
    }
}