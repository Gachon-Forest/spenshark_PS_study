/*
    Date: 2024.08.09
    No: 1927번
    Tier: 실버 II
    Name: 최소 힙
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1927 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        int value;
        ArrayList<Integer> heap = new ArrayList<>();
        heap.add(0);

        for (int i = 0; i < testCase; i++) {
            value = Integer.parseInt(br.readLine());
            if (value == 0) {
                if (heap.size() - 1 < 1) {
                    sb.append(0).append("\n");
                } else {
                    int del = heap.get(1);
                    heap.set(1, heap.get(heap.size() - 1));
                    heap.remove(heap.size() - 1);

                    int p = 1;
                    while (p * 2 < heap.size()) {
                        int min = heap.get(p * 2);
                        int minP = p * 2;

                        if ((p * 2 + 1) < heap.size() && min > heap.get(p * 2 + 1)) {
                            min = heap.get(p * 2 + 1);
                            minP = p * 2 + 1;
                        }

                        if (min > heap.get(p)) {
                            break;
                        }

                        int temp = heap.get(p);
                        heap.set(p, heap.get(minP));
                        heap.set(minP, temp);
                        p = minP;
                    }
                    sb.append(del).append("\n");
                }
            } else {
                heap.add(value);
                int p = heap.size() - 1;
                while (p > 1 && heap.get(p / 2) > heap.get(p)) {
                    int temp = heap.get(p / 2);
                    heap.set(p / 2, value);
                    heap.set(p, temp);

                    p /= 2;
                }
            }
        }

        System.out.println(sb);
    }
}