/*
    Date: 2024.08.09
    No: 11659번
    Tier: 실버 III
    Name: 구간 합 구하기
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11659 {

    static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        ArrayList<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken())-1;
            int num2 = Integer.parseInt(st.nextToken()) - 1;
            int sum = 0;

            if (num1 == num2) {
                sb.append(list.get(num1)).append("\n");
            } else {
                for (int j = num1; j <= num2; j++) {
                    sum += list.get(j);
                }
                sb.append(sum).append("\n");
            }
        }
        System.out.println(sb);
    }
}