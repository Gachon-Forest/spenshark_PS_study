/*
    Date: 2024.07.21
    No: 10816번
    Tier: 실버 IV
    Name: 카드2
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q10816 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        HashMap<Integer, Integer> map = new HashMap<>();

        int testCase = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int key = Integer.parseInt(st.nextToken());

            map.put(key, map.getOrDefault(key, 0) + 1); // value 가 있으면 value, 없으면 0
        }

        int needAmount = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < needAmount; i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(map.getOrDefault(key, 0)).append(" ");
        }


        System.out.println(sb);
    }
}
