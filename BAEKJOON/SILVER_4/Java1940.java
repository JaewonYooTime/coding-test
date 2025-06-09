package BAEKJOON.SILVER_4;

import java.io.*;
import java.util.*;

public class Java1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int cnt = 0;
        int p1 = 0;
        int p2 = N-1;
        while( p1 < p2 ){
            if( A[p1] + A[p2] == M ) {
                cnt++; p1++; p2--;
            } else if(A[p1] + A[p2] < M){
                p1++;
            } else {
                p2--;
            }
        }
        System.out.println(cnt);
    }
}
