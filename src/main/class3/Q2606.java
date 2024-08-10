/*
    Date: 2024.08.09
    No: 2606번
    Tier: 실버 III
    Name: 바이러스
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2606 {

    static int count;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int v = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        boolean[] virus = new boolean[v];
        Arrays.fill(virus, false);
        boolean[][] link = new boolean[v][v];
        for (boolean[] booleans : link) {
            Arrays.fill(booleans, false);
        }
        for (int i = 0; i < v; i++) {
            link[i][i] = true;
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken())-1;
            int v2 = Integer.parseInt(st.nextToken())-1;
            link[v1][v2] = link[v2][v1] = true;
        }

        linkVertex(link, virus, v, 0);

        System.out.println(count-1);
    }

    private static void linkVertex(boolean[][] link, boolean[] virus, int v, int start) {
        for (int i = 0; i < v; i++) {
            if (link[start][i]) {
                if (virus[i] == false) {
                    virus[i] = true;
                    count++;
                    linkVertex(link, virus, v, i);
                }
            }
        }
    }
}