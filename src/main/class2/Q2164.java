/*
    Date: 2024.07.09
    No: 2164번
    Tier: 실버 IV
    Name: 카드2
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Q2164 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            deque.addLast(i);
        }

        while (deque.size() > 1) {
            deque.removeFirst();
            deque.addLast(deque.removeFirst());
        }

        System.out.println(sb.append(deque.element()));
    }
}
