package BAEKJOON.SILVER_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11659_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] S = new long[suNo + 1];
        for(int i = 1; i <= suNo; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(int q = 0; q < quizNo; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(S[j] - S[i-1] + "\n");
        }
        System.out.println(sb);
    }
}
