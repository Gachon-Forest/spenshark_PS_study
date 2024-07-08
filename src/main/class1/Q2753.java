/*
    Date: 2024.07.08
    No: 2753번
    Tier: 브론즈 V
    Name: 윤년
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2753 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { // 윤년
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        br.close();
    }
}
