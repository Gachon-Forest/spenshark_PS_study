/*
    Date: 2024.08.10
    No: 1931번
    Tier: 실버 I
    Name: 회의실 배정
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1931 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[][] meet = new int[N][2];
        int count = 0;
        int time = -1;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            meet[i][0] = Integer.parseInt(st.nextToken());
            meet[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(meet, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) { // 끝 시간
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        for (int i = 0; i < N; i++) {
            if (meet[i][0] >= time) {
                time = meet[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}