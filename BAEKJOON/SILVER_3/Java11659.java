package BAEKJOON.SILVER_3;

import java.util.Scanner;

// 답은 맞는데, 시간 초과
public class Java11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" "); // 데이터 개수, 질의 개수 받기
        int N = Integer.parseInt(strArr[0]); // 데이터 개수
        int M = Integer.parseInt(strArr[1]); // 질의 개수

        // String[] 을 IntArray 로 만들기 , 합 배열 만들기
        strArr = sc.nextLine().split(" "); // 입력 데이터 String 받아서 String[]으로 만들기
        int[] arr = new int[N]; // 입력 데이터를 담을 정수 배열 그릇 만들기
        int[] sum = new int[N]; // 합 배열 그릇 만들기
        for(int i=0; i<strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
            if( i == 0 ) {
                sum[i] = arr[i];
            } else {
                sum[i] = sum[i-1] + arr[i];
            }
        }
        // 질의를 받고 답하기
        for(int i=0; i<M; i++) {
            strArr = sc.nextLine().split(" "); // 대상 구간을 입력받기
            int n1 = Integer.parseInt(strArr[0]) - 1;
            int n2 = Integer.parseInt(strArr[1]) - 1;
            if(n1 == n2){
                System.out.println(arr[n1]);
            } else if( n1 == 0 ){
                System.out.println(sum[n2]);
            } else {
                System.out.println(sum[n2]-sum[n1-1]); // n1이 0인 경우는 위에서 미리 조건으로 빼서 에러 괜찮음
            }
        }
    }
}