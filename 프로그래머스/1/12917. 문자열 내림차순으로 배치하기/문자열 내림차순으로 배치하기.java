import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray(); // 문자열을 문자배열로 변환
        Arrays.sort(chars); // 문자배열을 오름차순 정렬
        
        answer = new StringBuilder(new String(chars)).reverse().toString();
        // StringBuilder는 문자열을 뒤집기 위해 또 감쌈
        // StringBuilder 객체를 다시 문자열로 변환. 최종 결과를 문자열로 반환하기 위해 필요
        // Java에서는 문자열과 StringBuilder 간의 변환을 위해 .toString() 메소드를 사용
        return answer;
    }
}