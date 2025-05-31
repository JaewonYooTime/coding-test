package BAEKJOON.SILVER_1;

import java.io.*;
import java.util.StringTokenizer;

public class Java11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //정수 N(정방행렬의 크기), M(질의 개수) 입력 받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 입력 받기
        // NxN 크기의 이중 배열 그릇 만들기
        int[][] arr = new int[N][N];
        int[][] sum = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum[i][j] = (i==0 && j==0) ? arr[i][j] :
                            (j==0) ? sum[i-1][N-1] + arr[i][j] : sum[i][j-1] + arr[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x_row = Integer.parseInt(st.nextToken())-1;
            int x_col = Integer.parseInt(st.nextToken())-1;
            int y_row = Integer.parseInt(st.nextToken())-1;
            int y_col = Integer.parseInt(st.nextToken())-1;
            int result = (x_col == 0 && x_row == 0) ? sum[y_row][y_col] :
                         (x_row == 0) ? sum[y_row][y_col] - sum[x_row][N-1] : sum[y_row][y_col] - sum[x_row][x_col-1];
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}