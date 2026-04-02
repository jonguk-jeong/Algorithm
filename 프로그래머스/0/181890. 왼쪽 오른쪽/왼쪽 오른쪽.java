import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int k = 0; k < i; k++) {
                    list.add(str_list[k]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                for (int k = i+1; k < str_list.length; k++) {
                    list.add(str_list[k]);
                }
                break;
            }
        }
        
        if (list.isEmpty()) {
            String[] answer = {};
            return answer;
        }
        
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

// Arrays.copyOfRange(str_list, 0, i);
// 이거 사용하자