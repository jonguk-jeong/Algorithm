import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, 0);
        }

        int n1 = map.size();
        int n2 = nums.length / 2;

        return Math.min(n1, n2);
    }
}