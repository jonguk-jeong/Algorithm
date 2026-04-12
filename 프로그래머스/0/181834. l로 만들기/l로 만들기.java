class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if ((int) c < (int) 'l') {
                answer += "l";
                continue;
            }
            answer += c;
        }
        return answer;
    }
}