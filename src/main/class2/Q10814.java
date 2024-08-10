/*
    Date: 2024.07.21
    No: 10814번
    Tier: 실버 V
    Name: 나이순 정렬
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10814 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());

        StringBuilder[] members = new StringBuilder[201];

        for (int i = 0; i < members.length; i++) {
            members[i] = new StringBuilder();
        }

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            members[age].append(age).append(" ").append(name).append("\n");
        }

        StringBuilder s = new StringBuilder();

        for (StringBuilder member : members) {
            s.append(member);
        }

        System.out.println(s);
    }
}
