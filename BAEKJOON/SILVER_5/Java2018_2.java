package BAEKJOON.SILVER_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java2018_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int start_point = 1;
        int end_point = 1;
        int sum = 1;
        int cnt = 1;

        while( end_point != N ){
            if( sum == N ) {
                cnt++;
                end_point++;
                sum += end_point;
            }
            else if( sum < N ){
                end_point++;
                sum += end_point;
            }
            else {
                sum -= start_point;
                start_point++;
            }
        }
        System.out.println(cnt);
    }
}
