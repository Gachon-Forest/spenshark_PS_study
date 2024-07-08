/*
    Date: 2024.07.08
    No: 2439번
    Tier: 브론즈 IV
    Name: 별 찍기 - 2
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2439 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star = Integer.parseInt(br.readLine());

        for (int i = 0; i < star; i++) {
            for (int j = star-i; j > 1 ; j--) {
                System.out.print(" ");
            }
            for (int j = i+1; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
