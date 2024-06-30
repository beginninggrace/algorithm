class Solution {
    public int[] solution(int[] arr, int k) {
        int[] result = new int[arr.length];
        // k가 홀수면 각 arr의 값에 k 곱한 배열을 반환
        if(k%2!=0) {
            for(int i=0; i<arr.length; i++) {
                result[i] = arr[i]*k;
            }
        }
        // k가 짝수면 각 arr의 값에 k 더한 배열을 반환
        else {
            for(int i=0; i<arr.length; i++) {
                result[i] = arr[i]+k;
            }
        }
        return result;
    }
}
