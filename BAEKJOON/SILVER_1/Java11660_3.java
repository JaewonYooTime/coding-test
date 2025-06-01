package BAEKJOON.SILVER_1;

import java.io.*;
import java.util.StringTokenizer;

public class Java11660_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        /* ───── 입력 & 1차원 누적합(sum) 만들기 ───── */
        int[][] arr = new int[N][N];
        int[][] sum = new int[N][N];                 // (0,0)~(r,c)까지 “일자” 누적
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum[i][j] = (i == 0 && j == 0) ? arr[i][j]
                        : (j == 0) ? sum[i - 1][N - 1] + arr[i][j]
                        : sum[i][j - 1] + arr[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        /* ───── 질의 처리 ───── */
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int xs = Integer.parseInt(st.nextToken()) - 1;   // 시작 행
            int ys = Integer.parseInt(st.nextToken()) - 1;   // 시작 열
            int xe = Integer.parseInt(st.nextToken()) - 1;   // 끝   행
            int ye = Integer.parseInt(st.nextToken()) - 1;   // 끝   열

            long res = 0;
            for (int r = xs; r <= xe; r++) {                 // 행을 하나씩 처리
                int left;                                    // 왼쪽 경계 바로 앞까지의 누적
                if (ys == 0) {                               // 열 0부터 시작
                    left = (r == 0) ? 0 : sum[r - 1][N - 1]; // 이전 행까지의 총합
                } else {
                    left = sum[r][ys - 1];                   // 같은 행에서 ys-1까지
                }
                res += sum[r][ye] - left;                    // 해당 행 구간 합
            }
            sb.append(res).append('\n');
        }
        System.out.print(sb);
    }
}
