package BAEKJOON.SILVER_1;

import java.io.*;
import java.util.StringTokenizer;

public class Java11660_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 배열 크기
        int M = Integer.parseInt(st.nextToken()); // 질의 개수

        int[][] sum = new int[N + 1][N + 1]; // 누적합 배열 (1-based index)

        // 배열 입력과 동시에 누적합 계산
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int value = Integer.parseInt(st.nextToken());
                sum[i][j] = value + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
            }
        }

        StringBuilder sb = new StringBuilder();

        // 질의 처리
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = sum[x2][y2]
                    - sum[x1 - 1][y2]
                    - sum[x2][y1 - 1]
                    + sum[x1 - 1][y1 - 1];

            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}
