package BAEKJOON.GOLD_4;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N]; // 수열 배열 생성
        int[] ans = new int[N]; // 정답 배열 생성
        String[] str = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 처음에는 항상 스택이 비어있으므로 최초 값을 push하여 초기화
        for(int i=1; i<N; i++){
            // 스택 비어있지 않고 현재 수열이 스택의 Top 인덱스 가리키는 수열보다 크면
            while(!stack.isEmpty() && A[stack.peek()] < A[i]) {
                ans[stack.pop()] = A[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            // 반복문을 다 돌고 나왔는데 스택이 비어있지 않다면 빌 때까지
            ans[stack.pop()] = -1;
            // stack에 쌓인 index에 -1을 넣고
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<N; i++){
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        br.close();
    }
}
