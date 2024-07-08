/*
    Date: 2024.07.08
    No: 2475번
    Tier: 브론즈 V
    Name: 검증수
    Language: Java17
*/

package main.class1;

import java.util.Scanner;

public class Q2475 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int value = sc.nextInt();
            sum += value * value;
        }

        System.out.println(sum%10);
    }
}
