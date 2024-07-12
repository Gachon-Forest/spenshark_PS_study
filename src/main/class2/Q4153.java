/*
    Date: 2024.07.08
    No: 4153번
    Tier: 브론즈 III
    Name: 직각삼각형
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q4153 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(list); // 정렬

            if (list.equals(List.of(0, 0, 0))) { // 전부 0일 때
                break;
            }

            if (Math.pow(list.get(2), 2) == Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2)) { // pow(밑, 지수)
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
