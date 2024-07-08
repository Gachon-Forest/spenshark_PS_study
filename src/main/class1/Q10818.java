/*
    Date: 2024.07.08
    No: 10818번
    Tier: 브론즈 III
    Name: 최소, 최대
    Language: Java17
*/

package main.class1;

import java.util.Scanner;

public class Q10818 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int value;

        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < count; i++) {
            value = sc.nextInt();
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        System.out.println(min + " " + max);
    }
}
