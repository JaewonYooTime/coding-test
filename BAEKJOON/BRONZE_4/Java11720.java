package BAEKJOON.BRONZE_4;

import java.util.Scanner;

public class Java11720 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String sNum = sc.next();
    String[] arr = sNum.split("");
    int sum = 0;
    for(int i=0; i<arr.length; i++){
        sum += Integer.parseInt(arr[i]);
    }
        System.out.println(sum);
    }
}
