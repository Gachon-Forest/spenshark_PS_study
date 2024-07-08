/*
    Date: 2024.07.08
    No: 10250번
    Tier: 브론즈 III
    Name: ACM 호텔
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10250 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            st.nextToken();
            int sequence = Integer.parseInt(st.nextToken());

            if (sequence % height == 0) {
                sb.append((height * 100) + (sequence / height)).append('\n');

            } else {
                sb.append(((sequence % height) * 100) + ((sequence / height) + 1)).append('\n');
            }
        }
        System.out.println(sb);
    }
}

