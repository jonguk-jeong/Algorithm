class Solution {
    public String solution(String n_str) {        
        for (int i = 0; i < n_str.length(); i++) {
            char c = n_str.charAt(i);
            
            if (c != '0') return n_str.substring(i);
        }
        
        return "";
    }
}