package BAEKJOON.SILVER_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java1874_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        int n = 0;
        StringBuilder sb = new StringBuilder();
        boolean result = true;
        for(int i=0; i<N; i++){
            int num = A[i];
            while(n < num){
                n++;
                stack.push(n);
                sb.append("+\n");
            }
            if(n == num) {
                stack.pop();
                sb.append("-\n");
            }
            else if(stack.peek() == num){
                sb.append("-\n");
                stack.pop();
            } else result = false;
        }
        if(result) System.out.println(sb);
        else System.out.println("NO");
    }
}
