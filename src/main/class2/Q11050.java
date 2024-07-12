/*
    Date: 2024.07.09
    No: 11050번
    Tier: 브론즈 I
    Name: 이항 계수1
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11050 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int mol = 1;
        int den = 1;

        for (int i = K; i > 0; i--) {
            mol *= N--;
            den *= K--;
        }

        System.out.println(mol / den);
    }
}
