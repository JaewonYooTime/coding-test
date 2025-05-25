package Programmers;
import java.util.Arrays;

class ch5_p5_sol1 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rowSize = arr1.length;     // 결과 행의 개수
        int colSize = arr2[0].length;  // 결과 열의 개수
        int elemSize = arr1[0].length; // 곱셈에 쓰이는 요소 개수

        int[][] answer = new int[rowSize][colSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                for (int k = 0; k < elemSize; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }

    // ✅ 테스트용 메인 함수
    public static void main(String[] args) {
        ch5_p5_sol1 sol = new ch5_p5_sol1();

        int[][] arr1 = {
                {1, 4},
                {3, 2},
                {4, 1}
        };

        int[][] arr2 = {
                {3, 3},
                {3, 3}
        };

        int[][] result = sol.solution(arr1, arr2);

        System.out.println("행렬 곱셈 결과:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
