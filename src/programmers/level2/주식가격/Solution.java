import java.util.*;

public class Solution {
    public int[] solution(int[] prices) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int len = prices.length;

        int[] answer = new int[len];
        stack.push(0);

        for (int i=1; i<len; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = len - 1 -index;
        }

        return answer;
    }
}