package BAEKJOON.SILVER_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11659_4  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //데이터 개수, 질의 개수 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int quizN = Integer.parseInt(st.nextToken());

        //데이터 입력 받기
        st = new StringTokenizer(br.readLine());
        int[] S = new int[N+1];
        for(int i=1; i<=N; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        //질의 개수 만큼 반복
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<quizN; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int ans = S[b] - S[a-1];
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}