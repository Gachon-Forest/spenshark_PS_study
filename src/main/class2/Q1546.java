/*
    Date: 2024.07.09
    No: 1546번
    Tier: 브론즈 I
    Name: 평균
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1546 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Integer> list = new ArrayList<>();
        double sum = 0;
        int max = -1;

        int count = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            list.add(Integer.parseInt(st.nextToken()));
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        for (int value : list) {
            sum += (double) value * 100 / max; // 점수 올리기 작업
        }

        System.out.println(sum / count);

    }
}
