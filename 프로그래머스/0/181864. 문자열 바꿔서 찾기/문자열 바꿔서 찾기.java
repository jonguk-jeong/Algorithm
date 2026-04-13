class Solution {
    public int solution(String myString, String pat) {
        
        String tmp = myString.replace("A", "C");
        tmp = tmp.replace("B", "A");
        tmp = tmp.replace("C", "B");
        
        if (tmp.contains(pat)) return 1;
        
        return 0;
    }
}