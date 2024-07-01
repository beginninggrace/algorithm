import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        for(int i=0; i<strArr.length; i++) {
        // 만약에 한 배열이 홀수번째 인덱스에 위치했을 때
            if(i%2!=0) {
        // 모든 문자를 대문자로 변환
            strArr[i] = strArr[i].toUpperCase();
        }else {
        // 그 외에는 모든 문자를 소문자로 변환
                strArr[i] = strArr[i].toLowerCase();
            }
        }
        // 반환
        return strArr;
    }
}