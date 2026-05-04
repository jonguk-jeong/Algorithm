class Solution {
    int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int sum, int index) {
        // 종료 조건
        if (index == numbers.length) {
            if (sum == target) answer++;
            return;
        }
        
        // 중간
        dfs(numbers, target, sum + numbers[index], index + 1);
        dfs(numbers, target, sum - numbers[index], index + 1);
    }
}