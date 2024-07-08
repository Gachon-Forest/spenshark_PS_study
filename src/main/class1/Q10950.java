/*
    Date: 2024.07.08
    No: 10950번
    Tier: 브론즈 V
    Name: A+B - 3
    Language: Java17
*/

package main.class1;

import java.util.Scanner;

public class Q10950 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}
