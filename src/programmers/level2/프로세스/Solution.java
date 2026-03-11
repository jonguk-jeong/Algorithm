import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int[] arr = new int[priorities.length];

        for (int i = 0; i < priorities.length; i++) {
            q.offer(i);
        }

        int order = 1;

        while (!q.isEmpty()) {

            int current = q.poll();
            int max = 0;

            int len = q.size();

            for (int i = 0; i < len; i++){
                int index = q.poll();

                if (priorities[current] < priorities[index]) {
                    max = 1;
                }
                q.offer(index);
            }

            if (max == 1) {
                q.offer(current);
            } else {
                arr[current] = order++;
            }

        }

        return arr[location];
    }
}