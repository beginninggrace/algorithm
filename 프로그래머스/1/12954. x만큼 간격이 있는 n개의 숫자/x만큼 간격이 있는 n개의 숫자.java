class Solution {
    public long[] solution(long x, int n) { // x는 범위가 넓어 long으로 지정해야 한다
        long[] answer = new long[n]; // 배열의 길이를 나타내는 n을 넣어준다
        
        for(int i = 0; i < n; i++) { // n이 4일 경우 0, 1, 2, 3
            answer[i] = x * (i + 1);
        }
        return answer;
    }
}