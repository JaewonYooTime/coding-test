package BAEKJOON.SILVER_2;

import java.util.*;
import java.io.*;

public class Java12891_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        st = new StringTokenizer(br.readLine());
        int A_num = Integer.parseInt(st.nextToken());
        int C_num = Integer.parseInt(st.nextToken());
        int G_num = Integer.parseInt(st.nextToken());
        int T_num = Integer.parseInt(st.nextToken());
        int[] status = new int[4];

        int start_pnt = 0; int end_pnt = P-1; int cnt = 0;
        for(int i = start_pnt; i<=end_pnt; i++){
            if(str.charAt(i) == 'A') status[0]++;
            else if(str.charAt(i) == 'C') status[1]++;
            else if(str.charAt(i) == 'G') status[2]++;
            else if(str.charAt(i) == 'T') status[3]++;
        }
        while(true){
            if( status[0] >= A_num &&
                status[1] >= C_num &&
                status[2] >= G_num &&
                status[3] >= T_num ) cnt++;
            if(str.charAt(start_pnt) == 'A')      status[0]--;
            else if(str.charAt(start_pnt) == 'C') status[1]--;
            else if(str.charAt(start_pnt) == 'G') status[2]--;
            else if(str.charAt(start_pnt) == 'T') status[3]--;
            start_pnt++;
            end_pnt++;
            if(end_pnt == S) break;
            if(str.charAt(end_pnt) == 'A')      status[0]++;
            else if(str.charAt(end_pnt) == 'C') status[1]++;
            else if(str.charAt(end_pnt) == 'G') status[2]++;
            else if(str.charAt(end_pnt) == 'T') status[3]++;
        }
        System.out.println(cnt);
    }
}
