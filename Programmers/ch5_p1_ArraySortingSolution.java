package Programmers;

import java.util.Arrays;

public class ch5_p1_ArraySortingSolution {
    public static void main(String[] args) {

        int[][] arr = {
                {1, -5, 2, 4, 3},
                {2,1,1,3,2,5,4},
                {6,1,7}
        };
        for(int i=0; i<arr.length; i++){
            int[] ans = solution(arr[i]);
            System.out.println(Arrays.toString(ans));
        }
    }
    public static int[] solution(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
}