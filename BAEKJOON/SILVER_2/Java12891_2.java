package BAEKJOON.SILVER_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java12891_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String input = st.nextToken();
        st = new StringTokenizer(br.readLine());
        int Anum = Integer.parseInt(st.nextToken());
        int Cnum = Integer.parseInt(st.nextToken());
        int Gnum = Integer.parseInt(st.nextToken());
        int Tnum = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int[] numArr = check_pw(input.substring(0, P));
        if(numArr[0] >= Anum && numArr[1] >= Cnum && numArr[2] >= Gnum && numArr[3] >= Tnum) cnt++;
        for(int i = 0; i < S-P; i++){
            // 앞에꺼 빼고 검사, numArr 근황 업데이트
            if(input.charAt(i) == 'A') numArr[0]--;
            else if(input.charAt(i) == 'C') numArr[1]--;
            else if(input.charAt(i) == 'G') numArr[2]--;
            else if(input.charAt(i) == 'T') numArr[3]--;

            // 뒤에꺼 빼고 검사, numArr 근황 업데이트
            int lastIdx = P+i;
            if(input.charAt(lastIdx) == 'A') numArr[0]++;
            else if(input.charAt(lastIdx) == 'C') numArr[1]++;
            else if(input.charAt(lastIdx) == 'G') numArr[2]++;
            else if(input.charAt(lastIdx) == 'T') numArr[3]++;

            // 검사
            if(numArr[0] >= Anum && numArr[1] >= Cnum && numArr[2] >= Gnum && numArr[3] >= Tnum) cnt++;
        }
        System.out.println(cnt);
    }

    public static int[] check_pw(String subInput){
        int[] numArr = new int[4];
        for(int i = 0; i < subInput.length(); i++){
            if(subInput.charAt(i) == 'A') numArr[0]++;
            else if(subInput.charAt(i) == 'C') numArr[1]++;
            else if(subInput.charAt(i) == 'G') numArr[2]++;
            else if(subInput.charAt(i) == 'T') numArr[3]++;
        }
        return numArr;
    }
}


