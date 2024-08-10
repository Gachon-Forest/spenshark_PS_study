/*
    Date: 2024.08.10
    No: 2630번
    Tier: 실버 I
    Name: 색종이 만들기
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2630 {

    static int[][] colorPaper;
    static int white;
    static int blue;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        colorPaper = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                colorPaper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cutPaper(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void cutPaper(int x, int y, int size) {
        if (check(x, y, size)) {
            if (colorPaper[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        size /= 2;
        cutPaper(x, y, size);
        cutPaper(x+size, y, size);
        cutPaper(x, y+size, size);
        cutPaper(x+size, y+size, size);
    }

    private static boolean check(int x, int y, int size) {
        int color = colorPaper[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (colorPaper[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}