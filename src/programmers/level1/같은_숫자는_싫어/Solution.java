import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int listId = 0;

        list.add(arr[0]);

        for (int num : arr) {
            if (list.get(listId) != num) {
                list.add(num);
                listId++;
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}