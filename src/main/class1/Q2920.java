/*
    Date: 2024.07.08
    No: 2920번
    Tier: 브론즈 II
    Name: 음계
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String asc = "1 2 3 4 5 6 7 8";
        String des = "8 7 6 5 4 3 2 1";

        String scale = br.readLine();

        if (scale.equals(asc)) { // 문자열 일치 확인
            System.out.println("ascending");
        } else if (scale.equals(des)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
