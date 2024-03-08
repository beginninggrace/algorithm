class Solution {
    public int[] solution(int n, int m) {
        int gcd = Math.max(n, m); //a
        int min = Math.min(n, m); //b
        
        // 최대 공약수
        while(min != 0) {
            int r = gcd % min;
            gcd = min;
            min = r;
        }
        
        // 최소 공배수 = 두 수의 곱 / 최대공약수
        int lcm = n * m / gcd;
        int[] answer = {gcd, lcm}; // 최대공약수, 최대공배수
        return answer;
    }
}