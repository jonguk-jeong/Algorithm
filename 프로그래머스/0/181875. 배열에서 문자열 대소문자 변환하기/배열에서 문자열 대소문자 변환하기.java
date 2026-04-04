class Solution {
    public String[] solution(String[] strArr) {        
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 1) {
                strArr[i] = strArr[i].toUpperCase();
            } else {
                strArr[i] = strArr[i].toLowerCase();
            }
        }
        
        return strArr;
    }
}

// 이놈도 삼항 연산자면 한줄 가능