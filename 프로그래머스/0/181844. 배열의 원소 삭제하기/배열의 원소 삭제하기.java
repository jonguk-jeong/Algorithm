import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        for (int a : arr) {
            list.add(a);
        }

        for (int d : delete_list) {
            if (list.indexOf(d) != -1) {
                list.remove(list.indexOf(d));
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}