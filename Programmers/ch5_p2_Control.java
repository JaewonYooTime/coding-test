package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class ch5_p2_Control {
    public static void main(String[] args) {
        int[][] arr = {
                {4,2,2,1,3,4},
                {2,1,1,3,2,5,4}
        };
        for(int i=0; i<arr.length; i++){
            int[] ans = solution(arr[i]);
            System.out.println(Arrays.toString(ans));
        }
    }

    public static int[] solution(int[] arr){
        // 중복 제거
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        // 내림차순으로 정렬
        Arrays.sort(result, Collections.reverseOrder());
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}
