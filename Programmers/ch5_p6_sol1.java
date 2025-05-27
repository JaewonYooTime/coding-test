package Programmers;

import java.util.*;

public class ch5_p6_sol1 {

    public static void main(String[] args) {
        ch5_p6_sol1 sol = new ch5_p6_sol1();

        // 테스트 입력
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        // 결과 출력
        int[] result = sol.solution(N, stages);
        System.out.println("결과: " + Arrays.toString(result));
    }

    public int[] solution(int N, int[] stages) {
        // 각 스테이지 별 진행중인 도전자를 구하기
        int[] stage_ing = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            stage_ing[stages[i]] += 1;
        }

        // 각 스테이지 별 도달자 변수 선언
        int stage_tch = stages.length;

        // 실패율 계산
        Map<Integer, Double> fails = new HashMap<>();
        for (int i = 0; i < N; i++) {
            double fail = (stage_ing[i + 1] == 0 || stage_tch == 0)
                    ? 0.0
                    : (double) stage_ing[i + 1] / stage_tch;
            fails.put(i + 1, fail);
            stage_tch -= stage_ing[i + 1];
        }

        return fails.entrySet().stream()
                .sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
