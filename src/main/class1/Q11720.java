/*
    Date: 2024.07.08
    No: 11720번
    Tier: 브론즈 IV
    Name: 숫자의 합
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String value = br.readLine();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += Integer.parseInt(value.substring(i, i + 1)); // 문자열을 하나씩 나눠 정수로 변환
        }
        System.out.println(sum);
    }
}
