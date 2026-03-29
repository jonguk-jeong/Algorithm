import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < indices.length; i++) {
            list.add(indices[i]);
        }
        list.sort(null);
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(my_string);
        
        
        for (int i =0; i < indices.length; i++) {
            sb.deleteCharAt(list.get(i)-i);
        }
        
        return sb.toString();
    }
}