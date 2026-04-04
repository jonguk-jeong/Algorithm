class Solution {
    public int solution(String myString, String pat) {
        String upMy = myString.toUpperCase();
        String upPat = pat.toUpperCase();
        
        if (upMy.contains(upPat)) {
            return 1;
        } else {
            return 0;
        }
    }
}