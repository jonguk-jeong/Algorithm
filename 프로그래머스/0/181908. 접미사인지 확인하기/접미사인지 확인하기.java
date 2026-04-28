class Solution {
    public int solution(String my_string, String is_suffix) {
        int len = my_string.length();
        for (int i = 0; i < len; i++) {
            String str = my_string.substring(len - 1 - i, len);
            
            if (str.equals(is_suffix)) return 1;
        }
        return 0;
    }
}

// my_string.endsWith(is_suffix) 메서드 가능