/*
    Date: 2024.07.08
    No: 1978번
    Tier: 브론즈 II
    Name: 소수 찾기
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num_count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int prime_num_count = num_count;

        for (int i = 0; i < num_count; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) {
                prime_num_count -= 1;
            }
            if (num > 2) {
                for (int j = 2; j < num; j++) {
                    if(j > num/2)
                        break;
                    if (num % j == 0) {
                        prime_num_count -= 1;
                        break;
                    }
                }
            }
        }

        System.out.println(prime_num_count);
    }
}
