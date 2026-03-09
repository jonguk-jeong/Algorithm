import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i < progresses.length; i++) {
            int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i];

            if (!q.isEmpty() && q.peek() < day) {
                list.add(q.size());
                q.clear();
            }

            q.offer(day);
        }

        list.add(q.size());

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}