package BAEKJOON.SILVER_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11659_2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] sum = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
            sum[i] = (i == 0) ? sum[i] = arr[i] : sum[i-1] + arr[i];
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st2.nextToken())-1;
            int n2 = Integer.parseInt(st2.nextToken())-1;
            int result = (n1 == 0) ? sum[n2] : sum[n2]-sum[n1-1];
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
