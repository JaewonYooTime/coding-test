package BAEKJOON.BRONZE_1;

import java.util.Scanner;

public class Java1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        // String 값을 공백 기준 으로 분리
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        // 정수 배열로 변환
        int[] intArr = new int[N];
        for(int i=0; i<strArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        // 최댓값 구하기
        int max = 0;
        for(int i=0; i<intArr.length; i++){
            if( intArr[i] > max ) max = intArr[i];
        }
        // 정수 배열 다시 만들기
        double sum = 0;
        double[] doubleArr = new double[N];
        for(int i=0; i<intArr.length; i++){
            doubleArr[i] = ((double)intArr[i]/max)*100;
            sum += doubleArr[i];
        }
        // 평균값 구하고 출력
        double avg = sum / (double)N;
        System.out.println(avg);
    }
}
