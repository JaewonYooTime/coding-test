package BAEKJOON.SILVER_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java12891 {
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

        // P-S 크기만큼 반복
        int cnt = 0;
        for(int i = 0; i < S-P+1; i++){
            boolean check = check_pw(input.substring(i, S-(S-P)+i), Anum, Cnum, Gnum, Tnum);
            if(check) cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean check_pw(String subInput, int Anum, int Cnum, int Gnum, int Tnum){
        int[] numArr = new int[4];
        for(int i = 0; i < subInput.length(); i++){
            if(subInput.charAt(i) == 'A') numArr[0]++;
            else if(subInput.charAt(i) == 'C') numArr[1]++;
            else if(subInput.charAt(i) == 'G') numArr[2]++;
            else if(subInput.charAt(i) == 'T') numArr[3]++;
        }
        return numArr[0] == Anum && numArr[1] == Cnum && numArr[2] == Gnum && numArr[3] == Tnum;
    }
}


