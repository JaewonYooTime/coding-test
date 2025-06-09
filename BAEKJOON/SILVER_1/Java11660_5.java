package BAEKJOON.SILVER_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11660_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N+1][N+1];
        int[][] D = new int[N+1][N+1];
        for (int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
                D[i][j] = A[i][j] + D[i][j-1] + D[i-1][j] - D[i-1][j-1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            // 부분 합 배열을 이용한 질의 답변하기
            int result = D[x2][y2]
                         - D[x1 - 1][y2] - D[x2][y1 - 1]
                         + D[x1 - 1][y1 - 1];
            sb.append(result);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}