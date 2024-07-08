/*
    Date: 2024.07.08
    No: 2739번
    Tier: 브론즈 V
    Name: 구구단
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2739 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dan = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}
