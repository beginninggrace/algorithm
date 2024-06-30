import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        // 1. N과 X를 입력 받는다.
        String[] input = br.readLine().split(" ");
        // 2. 입력 받은 N, X를 정수로 변환
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        // 3. 수열 입력 받음 & 수열 분리
        input = br.readLine().split(" ");
        // 4. 배열을 정수로 변환
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        // 5. 분리된 수열의 값 중에서 X보다 작은 수를 뽑아내기
        for (int i = 0; i < N; i++) {
            if(A[i] < X) {
                bw.write(A[i] + " ");
            }
        }
        // 6. 출력




        br.close();
        bw.flush();
        bw.close();
    }
}