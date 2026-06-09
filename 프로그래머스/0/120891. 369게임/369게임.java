class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while(order/10 > 0) {
            int num = order%10;
            if (num == 3 || num == 6 || num == 9) {
                answer++;
            }
            order /= 10;
        }
        
        if (order%3 == 0) answer++;
    
        return answer;
    }
}