class Solution {
    public String solution(String myString, String pat) {
                
        for (int i = myString.length() - pat.length(); i >= 0; i-- ) {
            String str = myString.substring(i, i + pat.length());
            
            if (str.equals(pat)) {
                return myString.substring(0, i + pat.length());
            }
        }
        
        return "";
    }
}