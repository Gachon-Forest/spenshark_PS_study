/*
    Date: 2024.08.09
    No: 11723번
    Tier: 실버 V
    Name: 집합
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q11723 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashSet<Integer> set = new HashSet<Integer>();
        String str;

        int count = Integer.parseInt(br.readLine());
        int value;

        for (int i = 0; i < count; i++) {
            str = br.readLine();
            if (str.contains("add")) {
                value = Integer.parseInt(str.substring(4));
                set.add(value);
            }
            if (str.contains("check")) {
                value = Integer.parseInt(str.substring(6));
                if (set.contains(value)) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            if (str.contains("remove")) {
                value = Integer.parseInt(str.substring(7));
                set.remove(value);
            }
            if (str.contains("toggle")) {
                value = Integer.parseInt(str.substring(7));
                if (set.contains(value)) {
                    set.remove(value);
                } else {
                    set.add(value);
                }
            }
            if (str.equals("all")) {
                List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
                set = new HashSet<>(list);

            }
            if (str.equals("empty")) {
                set = new HashSet<>();
            }
        }
        System.out.println(sb);
    }
}
