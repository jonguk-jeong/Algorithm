import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        
        for (int a : arr) {
            if (list.size() < k && !list.contains(a)) {
                list.add(a);
            }
        }
        
        while(list.size() < k) {
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}