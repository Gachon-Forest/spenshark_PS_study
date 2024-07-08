/*
    Date: 2024.07.08
    No: 3052번
    Tier: 브론즈 II
    Name: 나머지
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>(); // set 자료구조

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            set.add(num % 42);
        }
        System.out.println(set.size());
    }
}
