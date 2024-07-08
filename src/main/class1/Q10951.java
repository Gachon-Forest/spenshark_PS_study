/*
    Date: 2024.07.08
    No: 10951번
    Tier: 브론즈 V
    Name: A+B - 4
    Language: Java17
*/

package main.class1;

import java.util.Scanner;

public class Q10951 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) { // 입력값이 존재하는지 확인
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}
