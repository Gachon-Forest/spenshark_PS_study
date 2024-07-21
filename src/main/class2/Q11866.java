/*
    Date: 2024.07.21
    No: 11866
    Tier: 실버 IV
    Name: 요세푸스 문제 0
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q1018 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        for(int i = 1; i <= N; i++) {
            deque.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while(deque.size() > 1) {

            for(int i = 0; i < K - 1; i++) {
                deque.offer(deque.poll()); // K-1만큼 큐의 뒤로 보내고
            }

            sb.append(deque.poll()).append(", "); // 젤 앞에 사람을 제거
        }

        sb.append(deque.poll()).append('>');
        System.out.println(sb);
    }
}
