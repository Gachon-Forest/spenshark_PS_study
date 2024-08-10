/*
    Date: 2024.08.09
    No: 1074번
    Tier: 실버 I
    Name: Z
    Language: Java17
*/

package main.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1074 {

    static int location;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        find(R, C, (int)Math.pow(2, N));

        System.out.println(location);
    }

    static void find(int r, int c, int size) {
        if(size==1)
            return;

        // r은 가로줄, c는 세로줄
        if (r < size / 2 && c < size / 2) {           // 왼쪽 위
            find(r, c, size / 2);
        } else if (r < size / 2 && size / 2 <= c) {   // 오른쪽 위
            location += (size * size / 4);
            find(r, c - size / 2, size / 2);
        } else if (r >= size / 2 && size / 2 > c) {   // 왼쪽 아래
            location += (size * size / 4) * 2;
            find(r - size / 2, c, size / 2);
        } else {                                      // 오른쪽 아래
            location += (size * size / 4) * 3;
            find(r - size / 2, c - size / 2, size / 2);

        }
    }
}