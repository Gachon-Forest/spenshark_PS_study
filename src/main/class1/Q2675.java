/*
    Date: 2024.07.08
    No: 2675번
    Tier: 브론즈 II
    Name: 문자열 반복
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2675 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int R;
        String S;
        StringBuilder P = new StringBuilder();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine()); // 기본값(" ")을 기준으로 문자열을 토큰화
            R = Integer.parseInt(st.nextToken()); 
            S = st.nextToken();
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    P.append(S.charAt(j));
                }
            }
            P.append("\n");
        }

        System.out.println(P);
    }
}
