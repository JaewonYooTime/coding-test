package Programmers;

import java.util.Arrays;


public class ch5_p4_sol1 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] ans1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] ans2 = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] ans3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 각 수포자의 정답 카운트 정수 변수
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        // 수포자 정답 일치 시, 각 수포자의 정답 카운트 증가
        for(int i=0; i<answers.length; i++){
            // 1번 수포자 정답 맞추는 조건
            if(answers[i] == ans1[i % ans1.length]){
                // 카운트 증가
                cnt1++;
            }
            // 2번 수포자 정답 맞추는 조건
            if (answers[i] == ans2[i % ans2.length]){
                // 카운트 증가
                cnt2++;
            }
            // 3번 수포자 정답 맞추는 조건
            if (answers[i] == ans3[i % ans3.length]){
                // 카운트 증가
                cnt3++;
            }
        }

        // 카운트 번호 같을 시, 처리 방법
        // 1==2==3
        if((cnt1 == cnt3) && (cnt2 == cnt3)) {
            answer = new int[]{1, 2, 3};
            Arrays.sort(answer);
            // (1==2) > 3
        } else if((cnt1 == cnt2) && (cnt1 > cnt3)) {
            answer = new int[]{1, 2};
            Arrays.sort(answer);
            // (2==3) > 1
        } else if((cnt2 == cnt3) && (cnt3 > cnt1)) {
            answer = new int[]{2, 3};
            Arrays.sort(answer);
            // (1==3) > 2
        } else if((cnt1 == cnt3) && (cnt1 > cnt2)) {
            answer = new int[]{1, 3};
            Arrays.sort(answer);
            // 1번이 제일 많이 맞춘 경우
        } else if(cnt1>cnt3 && cnt1> cnt2){
            answer = new int[]{1};
            // 2번이 제일 많이 맞춘 경우
        } else if(cnt2>cnt3 && cnt2> cnt1){
            answer = new int[]{2};
            // 3번이 제일 많이 맞춘 경우
        } else if(cnt3>cnt1 && cnt3> cnt2){
            answer = new int[]{3};
        }
        return answer;
    }
}
