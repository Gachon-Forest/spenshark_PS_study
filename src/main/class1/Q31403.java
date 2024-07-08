/*
    Date: 2024.07.08
    No: 31403번
    Tier: 브론즈 IV
    Name: A + B - C
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q31403 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        int C = Integer.parseInt(br.readLine());

        int A_B = Integer.parseInt(A) + Integer.parseInt(B);
        String AB = A + B;

        System.out.println(A_B - C);
        System.out.println(Integer.parseInt(AB) - C);
    }
}
