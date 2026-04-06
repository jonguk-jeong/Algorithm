import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        
        for (int k = 0; k < arr.length; k++) {
            
            if (flag[k]) {
                for (int i = 0; i < arr[k]*2; i++) {
                    list.add(arr[k]);
                }
            } else {
                for (int i = 0; i < arr[k]; i++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}