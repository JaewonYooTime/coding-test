package BAEKJOON.GOLD_3;

import java.io.*;
import java.util.*;
public class Java10986 {
    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 배열 크기
        int M = Integer.parseInt(st.nextToken()); // 나누는 값
        long[] count = new long[M]; // 나머지 별 개수 저장
        long sum = 0;
        long result = 0;
        st = new StringTokenizer(br.readLine());
        // prefixSum[0] = 0 → mod == 0 이므로 count[0] 미리 +1
        count[0] = 1;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            int mod = (int)(sum % M);
            // 음수 방지 (자바에선 mod가 음수 나올 수 있음)
            if (mod < 0) mod += M;
            result += count[mod];  // 지금까지 같은 mod를 가진 누적합 개수만큼 정답에 더하기
            count[mod]++;          // 이 mod의 개수 증가
        }
        System.out.println(result);
    }
}