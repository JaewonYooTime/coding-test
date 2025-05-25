package Programmers;

import java.util.*;

public class ch5_p4_sol2 {
    public int[] solution(int[] answers) {
        int[] patterns = {
                1, 2, 3, 4, 5,
                2, 1, 2, 3, 2, 4, 2, 5,
                3, 3, 1, 1, 2, 2, 4, 4, 5, 5
        };

        int[] ans1 = Arrays.copyOfRange(patterns, 0, 5);
        int[] ans2 = Arrays.copyOfRange(patterns, 5, 13);
        int[] ans3 = Arrays.copyOfRange(patterns, 13, 23);

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == ans1[i % ans1.length]) scores[0]++;
            if (answers[i] == ans2[i % ans2.length]) scores[1]++;
            if (answers[i] == ans3[i % ans3.length]) scores[2]++;
        }

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        List<Integer> topScorers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (scores[i] == maxScore) {
                topScorers.add(i + 1); // 1번, 2번, 3번 수포자
            }
        }

        return topScorers.stream().mapToInt(i -> i).toArray();
    }
}
