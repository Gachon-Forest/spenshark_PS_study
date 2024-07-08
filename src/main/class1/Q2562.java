/*
    Date: 2024.07.08
    No: 2562번
    Tier: 브론즈 III
    Name: 최댓값
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        int value;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            value = Integer.parseInt(br.readLine()); // br로 읽은 문자열을 정수로 변환
            if (value > max) {
                max = value;
                index = i+1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
