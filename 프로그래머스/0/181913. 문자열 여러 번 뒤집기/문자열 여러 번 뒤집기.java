class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] arr = new String[my_string.length()];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = my_string.substring(i, i+1);
        }
        
        for (int i = 0; i < queries.length; i++) {
            int len = (int) Math.ceil(((double) queries[i][1] - queries [i][0])/2);
            
            for (int j = 0; j < len; j++) {
                String tmp = arr[queries[i][0]+j];
                arr[queries[i][0]+j] = arr[queries[i][1]-j];
                arr[queries[i][1]-j] = tmp;
            }
        }
        
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}