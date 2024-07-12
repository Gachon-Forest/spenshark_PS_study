/*
    Date: 2024.07.08
    No: 30802번
    Tier: 브론즈 III
    Name: 웰컴키트
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q30802 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int min_shirts_amount = 0; // 최소 셔츠 묶음

        int member = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] shirts = new int[6];
        for (int i = 0; i < 6; i++) {
            shirts[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int shirts_set = Integer.parseInt(st.nextToken());
        int pen_set = Integer.parseInt(st.nextToken());

        for (int shirt : shirts) {
            if (shirt % shirts_set == 0) {
                min_shirts_amount += (shirt / shirts_set);
            } else {
                min_shirts_amount += (shirt / shirts_set) + 1;
            }
        }
        System.out.println(min_shirts_amount);

        System.out.print(member / pen_set + " " + member % pen_set);
    }
}
