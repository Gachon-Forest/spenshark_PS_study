/*
    Date: 2024.07.09
    No: 10814번
    Tier: 실버 V
    Name: 나이순 정렬
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10814아직못품 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        String[] list = new String[testCase];
        String temp;

        for (int i = 0; i < testCase; i++) {
            list[i] = br.readLine();
        }

        for (int i = 0; i < testCase - 1; i++) {
            for (int j = testCase - 1; j > i; j--) {
                if (toInteger(list[j - 1]) > toInteger(list[j])) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }

        for (String string : list) {
            sb.append(string).append("\n");
        }

        System.out.println(sb);
    }

    private static int toInteger(String str) {
        int index = str.indexOf(" ");
        return Integer.parseInt(str.substring(0, index));
    }
}
