/*
    Date: 2024.07.09
    No: 1546번
    Tier: 브론즈 I
    Name: 최대공약수와 최소공배수
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2609 {

    public static int gcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcd = gcd(num1, num2);
        int lcm = num1 * num2 / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
