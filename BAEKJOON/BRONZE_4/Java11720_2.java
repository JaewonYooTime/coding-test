package BAEKJOON.BRONZE_4;

import java.util.Scanner;

public class Java11720_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 숫자 N 입력 받기
        int N = sc.nextInt();
        // 문자열 입력받기
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(char c : cNum){
            sum += c - '0';
        }
        System.out.println(sum);
    }
}
