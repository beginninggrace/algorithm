class Solution {
    public int[] solution(int[] arr, int n) {
        // arr.length가 홀수일 경우
        if(arr.length%2!=0) {
        //모든 짝수 인덱스의 각각의 값에 n을 더한 배열을 반환
            for(int i=0; i<arr.length; i++) {
                if(i%2==0) {
                    arr[i] = arr[i] + n;
                }
            }
        }
        // arr.length가 짝수일 경우
        else {
        // 모든 홀수 인덱스의 각각의 값에 n을 더한 배열을 반환
            for(int i=0; i<arr.length; i++) {
                if(i%2!=0) {
                    arr[i] = arr[i] + n;
                }
            }
        }
        return arr;
    }
}