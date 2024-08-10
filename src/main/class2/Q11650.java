/*
    Date: 2024.07.21
    No: 11650번
    Tier: 실버 V
    Name: 좌표 정렬하기
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q11650 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        int[][] arr = new int[testCase][2];

        StringTokenizer st;
        for(int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Comparator<int[]> comparator = new Comparator<>() {
            @Override
            public int compare(int[] e1, int[] e2) {
                if (e1[0] == e2[0]) {
                    return e1[1] - e2[1];
                } else {
                    return e1[0] - e2[0];
                }
            }
        };

        Arrays.sort(arr, comparator);


        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < testCase ; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}
