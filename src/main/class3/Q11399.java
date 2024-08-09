/*
    Date: 2024.08.09
    No: 11399번
    Tier: 실버 IV
    Name: ATM
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q11399 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> atm = new ArrayList<>();

        int time = 0;
        int allTime = 0;
        int amount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < amount; i++) {
            atm.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(atm);

        for (Integer i : atm) {
            time += i;
            allTime += time;
        }

        System.out.println(allTime);
    }
}
