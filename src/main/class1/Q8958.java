/*
    Date: 2024.07.08
    No: 8958번
    Tier: 브론즈 II
    Name: OX퀴즈
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q8958 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int sum;
        int count;

        for (int i = 0; i < testCase; i++) {
            sum = 0;
            count = 0;
            char[] OX = br.readLine().toCharArray();

            for (char ox : OX) {
                if (ox == 'O') {
                    count += 1;
                    sum += count;
                } else {
                    count = 0;
                }
            }

            System.out.println(sum);
        }
    }
}
