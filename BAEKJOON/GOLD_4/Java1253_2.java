package BAEKJOON.GOLD_4;

import java.util.*;
import java.io.*;

public class Java1253_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int [N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int cnt = 0;
        for(int i=0; i<N; i++){
            int start_pnt   = 0;
            int end_pnt     = N-1;
            while(start_pnt < end_pnt) {
                if( start_pnt == i ) {
                    start_pnt++;
                } else if( end_pnt == i ){
                    end_pnt--;
                } else {
                    int sum = arr[start_pnt] + arr[end_pnt];
                    if ( sum == arr[i] ) {
                        cnt++;
                        break;
                    }
                    else if ( sum < arr[i] ) {
                        start_pnt++;
                    }
                    else {
                        end_pnt--;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
