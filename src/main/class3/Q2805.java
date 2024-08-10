/*
    Date: 2024.08.09
    No: 2805번
    Tier: 실버 II
    Name: 나무 자르기
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2805 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] length = new int[N];
        st = new StringTokenizer(br.readLine());
        int bottom = 0;
        int top = -1;
        for (int i = 0; i < N; i++) {
            length[i] = Integer.parseInt(st.nextToken());
            top = Math.max(length[i], top);
        }

        while (bottom <= top) {
            int mid = (bottom + top) / 2;
            int tree = 0;
            for (int i = 0; i < N; i++) {
                if (mid < length[i]) {
                    tree += length[i] - mid;
                }
            }
            if (tree >= M) {
                bottom = mid + 1;
            } else {
                top = mid - 1;
            }
        }

        System.out.println(top);
    }
}