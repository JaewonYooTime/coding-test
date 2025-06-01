package BAEKJOON.SILVER_1;

import java.io.*;
import java.util.StringTokenizer;

public class Java11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //정수 N(정방 행렬의 크기), M(질의 개수) 입력 받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 입력 받기
        // NxN 크기의 이중 배열 그릇 만들기
        int[][] arr = new int[N][N];
        int[][] sum = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum[i][j] = (i==0 && j==0) ? arr[i][j] :
                            (j==0) ? sum[i-1][N-1] + arr[i][j] : sum[i][j-1] + arr[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x_row = Integer.parseInt(st.nextToken())-1;
            int x_col = Integer.parseInt(st.nextToken())-1;
            int y_row = Integer.parseInt(st.nextToken())-1;
            int y_col = Integer.parseInt(st.nextToken())-1;
            int result = 0;
            // 결과 구하기
            // 1. 시작 행과 시작 열이 0인 경우
            if( x_row == 0 && x_col == 0 ){
                result = sum[y_row][y_col];
            }
            // 2. 시작 행과 종료 행이 0인 경우, 위에서 시작 열이 0인 경우는 소거
            else if(x_row == 0 && y_row == 0){
                result = sum[0][y_col] - sum[0][x_col-1];
            }
            // 3. 시작 행과 종료 행이 같은 경우, 위에서 시작 행과 종료 행이 0인 경우는 소거
            else if( x_row == y_row ){
                // 3.1 시작 열이 0인 경우 - 해당 행의 모든 요소의 합을 구하기
                if( x_col == 0 ){
                    result = sum[y_row][y_col] - sum[y_row-1][N-1];
                }
                // 3.2 시작 열이 0이 아닌 경우 - 해당 행의 시작 열부터 종료 열까지 모든 요소의 합 구하기
                else {
                    result = sum[y_row][y_col] - sum[y_row][x_col-1];
                }
            }
            // 4. 시작 행과 종료 행이 다른 경우, 위에서 시작 행과 종료 행이 0인 경우는 소거
            else {
                // 4.1 시작 열이 0인 경우 - 시작 점부터 끝 점까지 모든 요소의 합 구하기
                if( x_col == 0 ){
                    result = sum[y_row][y_col] - sum[x_row-1][N-1];
                }
                // 4.2 시작 열이 0이 아닌 경우 - 시작 점부터 종료 점까지 모든 요소의 합 구하기
                else {
                    int dif = 0;
                    for(int j=x_row+1; j<=y_row; j++){
                        for(int k=0; k<x_col; k++){
                            dif += arr[j][k];
                        }
                        for(int k=y_col+1; k<N; k++){
                            dif += arr[j][k];
                        }
                    }
                    result += sum[y_row][y_col] - sum[x_row][x_col-1] - dif;
                }
            }
//            sb.append(result).append("\n");
            System.out.println(result);
        }
//        System.out.println(sb);
    }
}