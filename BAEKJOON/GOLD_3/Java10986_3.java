package BAEKJOON.GOLD_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java10986_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] S = new long[N];
        long[] C = new long[M];
        long answer = 0;

        st = new StringTokenizer(br.readLine());
        S[0] = Integer.parseInt(st.nextToken());
        for(int i=1; i<N; i++){
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N; i++){
            int remainder = (int) (S[i] % M);
            if(remainder == 0) answer++;
            answer += C[remainder];
            C[remainder]++;
        }
//        for(int i=0; i<M; i++){
//            if( C[i] > 1 ){
//                answer += C[i] * ( C[i] - 1 ) / 2 ;
//            }
//        }
        System.out.println(answer);
    }
}
