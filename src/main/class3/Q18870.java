/*
    Date: 2024.08.10
    No: 18870번
    Tier: 실버 II
    Name: 좌표 압축
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q18870 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> co = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            co.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> sort = new ArrayList<>(co);
        Collections.sort(sort);

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for (Integer value : sort) {
            if (!map.containsKey(value)) {
                map.put(value, count);
                count++;
            }
        }

        for (Integer i : co) {
            sb.append(map.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}