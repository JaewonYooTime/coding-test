package BAEKJOON.SILVER_1;

import java.io.*;
import java.util.StringTokenizer;

public class Java11660_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 행렬 크기
        int M = Integer.parseInt(st.nextToken()); // 질의 개수

        int[][] arr = new int[N][N];
        int[][] sum = new int[N][N];  // 각 행의 누적합만 저장

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum[i][j] = (j == 0) ? arr[i][j] : sum[i][j - 1] + arr[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) - 1;
            int y1 = Integer.parseInt(st.nextToken()) - 1;
            int x2 = Integer.parseInt(st.nextToken()) - 1;
            int y2 = Integer.parseInt(st.nextToken()) - 1;

            int result = 0;

            for (int row = x1; row <= x2; row++) {
                if (y1 == 0) {
                    result += sum[row][y2];
                } else {
                    result += sum[row][y2] - sum[row][y1 - 1];
                }
            }

            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}
