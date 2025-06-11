package BAEKJOON.GOLD_4;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int i; int j; int cnt = 0;
        for(int k=0; k<N; k++){
            i = 0; j = N-1;
            while(i < j){
                if(k == i) {
                    i++; continue;
                }
                if(k == j) {
                    j--; continue;
                }
                if(A[i] + A[j] == A[k]) {
                    cnt++; break;
                }
                else if(A[i] + A[j] < A[k]) i++ ;
                else j--;
            }
        }
        System.out.println(cnt);
    }
}