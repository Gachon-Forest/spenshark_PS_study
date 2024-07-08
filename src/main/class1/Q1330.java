/*
    Date: 2024.07.08
    No: 1330번
    Tier: 브론즈 V
    Name: 두 수 비교하기
    Language: Java17
*/

package main.class1;

import java.util.Scanner;

public class Q1330 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String result;
        if (A > B) {
            result = ">";
        } else if (A < B) {
            result = "<";
        } else {
            result = "==";
        }
        System.out.println(result);
    }
}
