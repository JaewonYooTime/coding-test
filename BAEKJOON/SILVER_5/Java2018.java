package BAEKJOON.SILVER_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int p1 = 1; int p2 = 1; int cnt = 1; int sum = 1;
        while( p1 != N ){
            if ( sum == N ) {
                cnt++; p2++; sum += p2;
            } else if ( sum < N ) {
                p2++; sum += p2;
            } else {
                sum -= p1; p1++;
            }
        }
        System.out.println(cnt);
    }
}
