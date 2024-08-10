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
import java.util.StringTokenizer;

public class Q11659 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        ArrayList<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int value = 0;
        int sum = 0;
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            value = Integer.parseInt(st.nextToken());
            sum += value;
            arr[i] = sum;
            list.add(value);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken()) - 1;
            int num2 = Integer.parseInt(st.nextToken()) - 1;

            if (num1 == 0) {
                sb.append(arr[num2]).append("\n");
            } else {
                sb.append(arr[num2] - arr[num1-1]).append("\n");
            }

        }
        System.out.println(sb);
    }
}