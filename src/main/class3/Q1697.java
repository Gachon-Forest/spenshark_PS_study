/*
    Date: 2024.08.09
    No: 1697번
    Tier: 실버 I
    Name: 숨바꼭질
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Q1697 {

    static int[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        visited = new int[100001];

        System.out.println(find(N, K));
    }

    private static int find(int N, int K) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(N);
        int n;
        visited[N] = 1;

        while (!queue.isEmpty()) {
            n = queue.poll();
            if (n == K) {
                return visited[n] - 1;
            }
            if (n - 1 >= 0 && visited[n-1] == 0) {
                visited[n-1] = visited[n] + 1;
                queue.add(n - 1);
            }
            if (n + 1 <= 100000 && visited[n + 1] == 0) {
                visited[n + 1] = visited[n] + 1;
                queue.add(n + 1);
            }
            if (n * 2 <= 100000 && visited[n * 2] == 0) {
                visited[n * 2] = visited[n] + 1;
                queue.add(n * 2);
            }
        }
        return -1;
    }
}