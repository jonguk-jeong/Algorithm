class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            String c = myString.substring(i, i+1);
            
            if (c.equals("a") || c.equals("A")) {
                answer += "A";
            } else {
                answer += c.toLowerCase();
            }
        }
        
        return answer;
    }
}

// 반복문 필요 없네
// myString = myString.toLowerCase();
// return myString.replace("a", "A");