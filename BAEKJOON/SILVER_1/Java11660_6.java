package BAEKJOON.SILVER_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11660_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[][] S = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                S[i][j] = Integer.parseInt(st.nextToken()) + S[i][j-1];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<Q; i++){
            st = new StringTokenizer(br.readLine());
            int X1 = Integer.parseInt(st.nextToken());
            int Y1 = Integer.parseInt(st.nextToken());
            int X2 = Integer.parseInt(st.nextToken());
            int Y2 = Integer.parseInt(st.nextToken());
            int sum = 0;

            for(int j=X1; j<=X2; j++){
                sum += S[j][Y2] - S[j][Y1-1];
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
