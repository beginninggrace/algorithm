import java.util.*;

class Solution {
    public String solution(String my_string, String alp) {
        // string 다 char로 분리
        char[] separate = my_string.toCharArray();
        char separateAlp = alp.charAt(0);
        // 순회하면서 만약에 alp가 my_string에 포함된 경우
        for(int i=0; i<separate.length; i++) {
            if(separateAlp == separate[i]) {
                // touppercase로 변환
                separate[i] = Character.toUpperCase(separate[i]);
            }
        }
        // 반환
        String result = new String(separate);
        return result;
    }
}