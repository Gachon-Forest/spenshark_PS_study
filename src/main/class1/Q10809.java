/*
    Date: 2024.07.08
    No: 10809번
    Tier: 브론즈 II
    Name: 알파벳 찾기
    Language: Java17
*/

package main.class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q10809 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] index = new int[26];

        Arrays.fill(index, -1); // 배열 모두 -1로 초기화

        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) -97; // a는 아스키코드로 97
            if(index[num] == -1)
                index[num] = i;
        }

        for (int i : index) {
            System.out.print(i + " ");
        }
    }
    /*
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        for(char c ='a'; c<='z'; c++) {
            bw.write(str.indexOf(c)+" ");
        }
        bw.flush();
        br.close();
        bw.close();
    }
    */
}


