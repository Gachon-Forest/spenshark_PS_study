/*
    Date: 2024.07.08
    No: 11654번
    Tier: 브론즈 V
    Name: 아스키 코드
    Language: Java17
*/

package main.class1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ascii = br.readLine().charAt(0); // 0번 인덱스의 문자를 가져옴
        System.out.println((int) ascii);
    }
}
