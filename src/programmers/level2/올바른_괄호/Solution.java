import java.util.*;

class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i=0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(') {
                stack.addFirst('(');
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pollLast();
            }
        }
        return stack.isEmpty();
    }
}
