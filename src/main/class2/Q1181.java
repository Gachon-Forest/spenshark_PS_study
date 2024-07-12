/*
    Date: 2024.07.09
    No: 1181번
    Tier: 실버 V
    Name: 단어 정렬
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q1181 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> list = new ArrayList<>(set);
        String[] strings = list.toArray(new String[set.size()]);
        String temp;

        for (int i = 0; i < strings.length-1; i++) {
            for (int j = i; j >= 0; j--) {
                if (strings[j+1].length() < strings[j].length()) { // 길이가 작은 것을 앞으로
                    temp = strings[j+1];
                    strings[j+1] = strings[j];
                    strings[j] = temp;
                } else if (strings[j+1].length() == strings[j].length()) { // 길이가 같으면
                    if (strings[j + 1].compareTo(strings[j]) < 0) { // 사전 순으로
                        temp = strings[j+1];
                        strings[j+1] = strings[j];
                        strings[j] = temp;
                    }
                }
            }
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
