class Solution {
    public int[] solution(int[] arr) {        
        int start = -1;
        int end = -1;
        
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) start = i;
                end = i; 
            }
        }
        
        if (start == -1) {
            int[] answer = new int[1];    
            answer[0] = -1;
            return answer;
        }
        
        if (start != -1 && end == start) {
            int[] answer = new int[1];
            answer[0] = arr[start];
            return answer;
        } 
        
        int[] answer = new int[end - start + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[start++];
        }
        
        return answer;
    }
}

// int[] zero = {-1};
// int[] one = {2};
// 이게 좀 더 깔끔한듯