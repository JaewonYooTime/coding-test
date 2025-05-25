package Programmers;
import java.util.*;

public class ch5_p3_HashSet_Sorting_Example {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}