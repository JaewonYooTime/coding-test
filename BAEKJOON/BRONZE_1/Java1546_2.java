package BAEKJOON.BRONZE_1;

import java.util.Scanner;

public class Java1546_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int[] intArr = new int[N];
        int max = 0;
        for(int i=0; i<N; i++){
            intArr[i] = sc.nextInt();
            if(intArr[i] > max) max = intArr[i];
        }
        double sum = 0;
        double[] doubleArr = new double[N];
        for(int i=0; i<N; i++){
            doubleArr[i] = (double)intArr[i]/max*100;
            sum += doubleArr[i];
        }
        System.out.println( sum / N );
    }
}
