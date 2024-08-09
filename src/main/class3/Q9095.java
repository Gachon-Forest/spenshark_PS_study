/*
    Date: 2024.08.09
    No: 9095번
    Tier: 실버 III
    Name: 1, 2, 3 더하기
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9095 {

    static int dp[] = new int [11];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }

        for (int i = 0; i < testCase; i++) {
            int value = Integer.parseInt(br.readLine());
            sb.append(dp[value]).append("\n");
        }

        System.out.println(sb);
    }
}