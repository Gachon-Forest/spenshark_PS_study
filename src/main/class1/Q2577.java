/*
    Date: 2024.07.08
    No: 2577번
    Tier: 브론즈 II
    Name: 숫자의 개수
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int mul = a * b * c;
        int[] count = new int[10];
        String value = mul + "";

        for (int i = 0; i < value.length(); i++) {
            int num = Character.getNumericValue(value.charAt(i));
            count[num] += 1;
        }

        for (int i : count) {
            System.out.println(i);
        }
    }
}
