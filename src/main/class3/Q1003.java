/*
    Date: 2024.08.09
    No: 1003번
    Tier: 실버 III
    Name: 피보나치 함수
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1003 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        int[][] fib = new int[41][2];

        fib[0][0] = 1;
        fib[0][1] = 0;
        fib[1][0] = 0;
        fib[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            fib[i][0] = fib[i - 1][0] + fib[i - 2][0];
            fib[i][1] = fib[i - 1][1] + fib[i - 2][1];
        }

        for (int i = 0; i < testCase; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value == 0) {
                sb.append(1).append(" ").append(0).append("\n");
            } else if (value == 1) {
                sb.append(0).append(" ").append(1).append("\n");
            } else {
                sb.append(fib[value][0]).append(" ").append(fib[value][1]).append("\n");
            }
        }

        System.out.println(sb);
    }

}
