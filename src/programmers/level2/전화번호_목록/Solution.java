import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();

        for (String string : phone_book) {
            map.put(string, 0);
        }

        for (String string : phone_book) {
            for (int i = 0; i < string.length(); i++) {
                if (map.containsKey(string.substring(0, i))) return false;
            }
        }

        return true;
    }
}

// class Solution {
//     public boolean solution(String[] phone_book) {

//         for (String string : phone_book) {
//             for (String key : phone_book) {
//                 if (key.equals(string)) continue;

//                 if (key.startsWith(string)) return true;
//             }
//         }

//         return false;
//     }
// }

// 그냥 완전탐색하면 시간복잡도 초과 : O(n^2)
// 그래서 해쉬맵 contains 사용해서 접두어를 체크 해야함
// 그리고 시간복잡도도 O(n)으로 해야함. 아이디어 필요!
// -> 문자열을 접두어로 갖는지 체크하는게 아니라, 문자열의 접두어가 해쉬맵에 포함되는지 체크!