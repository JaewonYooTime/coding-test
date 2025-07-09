package BAEKJOON.SILVER_4;

import java.io.*;
import java.util.*;

public class Java1940_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int sum = 0; int cnt = 0;
        int start_pnt = 0;
        int end_pnt = arr.length-1;
        while( start_pnt < end_pnt ) {
            sum = arr[start_pnt] + arr[end_pnt];
            if( sum == M ){
                cnt++;
                start_pnt++;
            }
            else if( sum > M ) end_pnt--;
            else start_pnt++;
        }
        System.out.println(cnt);
    }
}
