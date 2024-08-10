/*
    Date: 2024.07.21
    No: 1018번
    Tier: 실버 IV
    Name: 체스판 다시 칠하기
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1018 {

    public static boolean[][] board;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];


        // 배열 입력
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    board[i][j] = true;		// W일 때는 true
                } else {
                    board[i][j] = false;		// B일 때는 false
                }
            }
        }

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                chessBoard(i, j);
            }
        }
        System.out.println(min);
    }


    public static void chessBoard(int x, int y) {
        int count = 0;
        boolean color = board[x][y];	// 첫 번째 칸의 색

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                // 올바른 색이 아닐경우(W W 나 B B 같이 올바르지 않을 때) count 1 증가
                if (board[i][j] != color) {
                    count++;
                }
                color = (!color); // W B W B 이런식으로 교차
            }
            color = !color; // 위에 이어서 B W B W 이런식으로 교차
        }

        count = Math.min(count, 64 - count); // 젤 처음 색이 W일 때와 B일 때의 값 중 최소값
        min = Math.min(min, count); // 최소값 갱신
    }
}
