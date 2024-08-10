/*
    Date: 2024.08.09
    No: 1012번
    Tier: 실버 II
    Name: 유기농 배추
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1012 {

    static int count;
    static int[][] field;
    static boolean[][] check;
    static int width, height;
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            count = 0;
            st = new StringTokenizer(br.readLine());
            width = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());
            field = new int[width][height];
            check = new boolean[width][height];

            for (int j = 0; j < location; j++) {
                st = new StringTokenizer(br.readLine());
                int M = Integer.parseInt(st.nextToken());
                int N = Integer.parseInt(st.nextToken());
                field[M][N] = 1;
            }

            for (int a = 0; a < width; a++) {
                for (int b = 0; b < height; b++) {
                    if (field[a][b] == 1 && !check[a][b]) {
                        dfs(a, b);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

    }

    private static void dfs(int M, int N) {
        check[M][N] = true;

        for (int i = 0; i < 4; i++) {
            int x = M + dx[i];
            int y = N + dy[i];

            if (x >= 0 && y >= 0 && x < width && y < height) {
                if (!check[x][y] && field[x][y] == 1) {
                    dfs(x, y);
                }
            }
        }
    }
}