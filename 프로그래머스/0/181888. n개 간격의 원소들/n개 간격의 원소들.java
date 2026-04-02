class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = (int) Math.ceil ((double) num_list.length / n);
        int[] answer = new int[len];
        int index = 0;
        
        for (int i = 0; i < num_list.length; i += n) {
            answer[index++] = num_list[i];
        }
        return answer;
    }
}

// 소수점 올리는 거 삼항연산자도 좋은것 같다
// int N = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;