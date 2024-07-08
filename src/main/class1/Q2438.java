/*
    Date: 2024.07.08
    No: 2438번
    Tier: 브론즈 V
    Name: 별 찍기 - 1
    Language: Java17
*/

package main.class1;

import java.util.Scanner;

public class Q2438 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        for (int i = 0; i < star; i++) {
            for (int j = i+1; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
