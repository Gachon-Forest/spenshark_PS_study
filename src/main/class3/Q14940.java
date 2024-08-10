/*
    Date: 2024.08.09
    No: 14940번
    Tier: 실버 I
    Name: 쉬운 최단거리
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Q14940 {

    static int N, M;
    static int[][] goal;
    static int[][] distance;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static ArrayDeque<int[]> queue = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        goal = new int[N][M];
        distance = new int[N][M];
        visited = new boolean[N][M];

        int startX = 0, startY = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int value = Integer.parseInt(st.nextToken());
                if (value == 2) {
                    startX = i;
                    startY = j;
                } else if (value == 0) {
                    visited[i][j] = true;
                }
                goal[i][j] = value;
            }
        }

        BFS(startX, startY);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    distance[i][j] = -1;
                }
                sb.append(distance[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static void BFS(int X, int Y) {
        queue.add(new int[]{X, Y});
        visited[X][Y] = true;

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = arr[0] + dx[i];
                int y = arr[1] + dy[i];
                if (x >= 0 && x < N && y >= 0 && y < M) {
                    if (!visited[x][y] && goal[x][y] == 1) {
                        visited[x][y] = true;
                        distance[x][y] = distance[arr[0]][arr[1]] + 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}