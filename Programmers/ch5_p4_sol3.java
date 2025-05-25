package Programmers;

import java.util.*;

public class ch5_p4_sol3 {

    public static int[] solution(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},                 // 수포자 1
                {2, 1, 2, 3, 2, 4, 2, 5},        // 수포자 2
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}   // 수포자 3
        };

        int[] scores = new int[3];

        for(int i=0; i<answers.length; i++){
            if( answers[i] == patterns[0][i % patterns[0].length] ) scores[0]++;
            if( answers[i] == patterns[1][i % patterns[1].length] ) scores[1]++;
            if( answers[i] == patterns[2][i % patterns[2].length] ) scores[2]++;
        }

        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<scores.length; i++){
            if(scores[i] == max) arr.add(i+1);
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }

    // ✅ 테스트용 main 함수
    public static void main(String[] args) {
        int[] sampleAnswers = {1, 3, 2, 4, 2};  // 정답 예시
        int[] result = solution(sampleAnswers);

        System.out.println("Top scorer(s): " + Arrays.toString(result));
    }
}
