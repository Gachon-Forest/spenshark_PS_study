/*
    Date: 2024.07.09
    No: 1259번
    Tier: 브론즈 I
    Name: 팰린드롬수
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1259 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        String str, reverseStr;
        int str_half;

        while (true) {
            str = br.readLine();
            if (str.equals("0")) {
                break;
            }

            str_half = str.length() / 2;
            
            if (str.length() % 2 == 0) { // 짝수이면 반반 나눠서 체크
                sb = new StringBuilder(str.substring(str_half));
                reverseStr = sb.reverse().toString();

                if (str.substring(0, str_half).equals(reverseStr)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else { // 홀수이면 중앙빼고 반반 나눠서 체크
                sb = new StringBuilder(str.substring(str_half+1));
                reverseStr = sb.reverse().toString();

                if (str.substring(0, str_half).equals(reverseStr)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
