/*
    Date: 2024.07.08
    No: 2884번
    Tier: 브론즈 III
    Name: 알람 시계
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        minute -= 45;

        if (minute < 0) {
            hour -= 1;
            minute += 60;
        }

        if (hour < 0) {
            hour += 24;
        }

        System.out.println(hour + " " + minute);
    }
}
