package Programmers;

import java.util.*;

public class ch5_p7 {
    public static void main(String[] args) {
        ch5_p7_sol1 sol = new ch5_p7_sol1();

        // 테스트 케이스 1
        String dirs1 = "ULURRDLLU";
        int result1 = sol.solution(dirs1);
        System.out.println("Test 1: " + result1); // 예상 출력: 7

        // 테스트 케이스 2
        String dirs2 = "LULLLLLLU";
        int result2 = sol.solution(dirs2);
        System.out.println("Test 2: " + result2); // 예상 출력: 7

        // 테스트 케이스 3
        String dirs3 = "UDUDUDUD";
        int result3 = sol.solution(dirs3);
        System.out.println("Test 3: " + result3); // 예상 출력: 1

        // 테스트 케이스 4
        String dirs4 = "UUUUUUUUUU";
        int result4 = sol.solution(dirs4);
        System.out.println("Test 4: " + result4); // 예상 출력: 5 (y 좌표 최대 5까지)
    }
}

class ch5_p7_sol1 {
    public int solution(String dirs) {
        String[] dirsList = dirs.split("");
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        // 상태 좌표 생성
        int x = 0, y = 0;
        for (String d : dirsList) {
            // 기존 상태 좌표 저장
            int pre_x = x;
            int pre_y = y;
            // 현재 상태 좌표 변경
            if (d.equals("U") && y < 5) y++;
            else if (d.equals("D") && y > -5) y--;
            else if (d.equals("L") && x > -5) x--;
            else if (d.equals("R") && x < 5) x++;
            else continue;
            // 상태 좌표를 저장할 리스트 선언
            ArrayList<Integer> path = new ArrayList<>();
            // 현재 상태가 바뀌었으면 경로 추가
            if (pre_x > x || (pre_x == x && pre_y > y)) {
                path.add(x); path.add(y); path.add(pre_x); path.add(pre_y);
            } else {
                path.add(pre_x); path.add(pre_y); path.add(x); path.add(y);
            }
            set.add(path);
        }

        return set.size();
    }
}
