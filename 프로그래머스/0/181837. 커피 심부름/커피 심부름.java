class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (String str : order) {
            if (str.contains("cafelatte")) {
                answer += 500;
            }
            answer += 4500;
        }
        
        return answer;
    }
}