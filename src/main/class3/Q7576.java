/*
    Date: 2024.08.09
    No: 7576번
    Tier: 골드 V
    Name: 토마토
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Q7576 {

    static int M, N;
    static int[][] tomato;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static ArrayDeque<int[]> queue = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        tomato = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if (tomato[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        System.out.println(BFS());
    }

    private static int BFS() {
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int beforeX = arr[0];
            int beforeY = arr[1];
            for (int i = 0; i < 4; i++) {
                int x = beforeX + dx[i];
                int y = beforeY + dy[i];
                if (x >= 0 && x < N && y >= 0 && y < M) {
                    if (tomato[x][y] == 0) {
                        tomato[x][y] = tomato[beforeX][beforeY] + 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomato[i][j] == 0){
                    return -1;
                } else if (max < tomato[i][j]) {
                    max = tomato[i][j];
                }
            }
        }

        return max - 1;
    }
}