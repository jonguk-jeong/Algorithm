class Solution {
    public String solution(String my_string, int s, int e) {
        
        String str = "";
        for (int i = 0; i < e-s+1; i++) {
            str += my_string.substring(e-i, e+1-i);
        }
        
        String answer = my_string.substring(0, s) + str 
            + my_string.substring(e+1);
        return answer;
    }
}