/*
    Date: 2024.07.08
    No: 1152번
    Tier: 브론즈 II
    Name: 단어의 개수
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1152 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.countTokens()); // 토큰 개수 출력
    }
}
