/*
    Date: 2024.08.09
    No: 1764번
    Tier: 실버 IV
    Name: 듣보잡
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q1764 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> dbj = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            dbj.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String people = br.readLine();
            if (dbj.contains(people)) {
                list.add(people);
            }
        }

        Collections.sort(list);

        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(list.size());
        System.out.println(sb);
    }
}
