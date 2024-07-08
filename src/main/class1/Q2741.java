/*
    Date: 2024.07.08
    No: 2741번
    Tier: 브론즈 V
    Name: N 찍기
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2741 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }
}
