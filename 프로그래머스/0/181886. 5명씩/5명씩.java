class Solution {
    public String[] solution(String[] names) {
        
        int len = names.length;
        int answerLen = (int) Math.ceil((double) len / 5);
        String[] answer = new String[answerLen];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = names[5*i];
        }
        
        return answer;
    }
}