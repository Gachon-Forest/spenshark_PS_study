/*
    Date: 2024.08.09
    No: 11724번
    Tier: 실버 II
    Name: 연결 요소의 개수
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q11724 {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        int count = 0;
        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]){
                dfs(i);
                count++;
            }
        }

        System.out.println(count);

    }

    private static void dfs(int v) {
        visited[v] = true;

        for (int u : graph[v]) {
            if (!visited[u]) {
                dfs(u);
            }
        }
    }
}