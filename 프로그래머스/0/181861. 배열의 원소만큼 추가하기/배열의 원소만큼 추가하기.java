import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 빈 배열 X
        List<Integer> result = new ArrayList<>();
        
        // 양의 정수배열 arr의 첫번째 인덱스값부터 뽑기
        for(int number : arr) {
        // 빈 배열에 원소를 원소값만큼 추가하기
            for(int i=0; i<number; i++) {
                result.add(number);
            }
        }
        // 배열 반환
        int[] fnl = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            fnl[i] = result.get(i);
        }
        return fnl;
    }
}