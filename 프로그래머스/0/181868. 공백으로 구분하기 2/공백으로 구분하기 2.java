import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        // 공백을 기준으로 분리
        String[] answer = my_string.split(" +");
        // 공백이 없을 경우, 해당 스트링을 다시 담기
        List<String> collect = new ArrayList<>();
        for(String a : answer) {
            if(!a.isEmpty()) {
               collect.add(a); 
            }
        }
        // 배열 공간 만들어주기
        // String[] result = new String[collect.size];
        // 배열로 변환해서 반환
        return collect.toArray(new String[0]);
    }
}