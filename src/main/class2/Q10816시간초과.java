/*
    Date: 2024.07.09
    No: 10816번
    Tier: 실버 IV
    Name: 카드2
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q10816시간초과 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();



        int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int have = Integer.parseInt(br.readLine());
        int[] haves = new int[num];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < have; i++) {
            int have_card = Integer.parseInt(st.nextToken());
            for (Integer value : list) {
                if (value == have_card) {
                    haves[i] += 1;
                }
            }
            sb.append(haves[i]).append(" ");
        }

        System.out.println(sb);
    }
}
