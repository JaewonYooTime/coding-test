package BAEKJOON.SILVER_2;

import java.util.*;
import java.io.*;

public class Java1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            st= new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = 1;
        boolean result = true;
        for (int i=0; i< arr.length; i++) {
            int su = arr[i];
            if (su >= num) {
                while(su >= num){
                stk.push(num++);
                sb.append("+\n");
                }
                stk.pop();
                sb.append("-\n");
            }
            else {
                int n = stk.pop();
                if(n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    sb.append("-\n");
                }
            }
        }
        if(result) System.out.println(sb);
    }
}
