package BAEKJOON.SILVER_3;

import java.util.Scanner;
import java.util.Stack;

public class Java1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 1; // 오름차순 수
        boolean result = true;
        for(int i=0; i<A.length; i++){
            int su = A[i]; // 현재 수열의 수
            if(su >= num){ // 현재 수열 값 >= 오름차순 자연수 : 값이 같아 질 때까지 push() 수행
                while( su >= num ) { // push()
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
        }
    }
}
