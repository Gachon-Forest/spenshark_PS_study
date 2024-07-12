/*
    Date: 2024.07.09
    No: 10845번
    Tier: 실버 IV
    Name: 큐
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10845 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] queue = new int[10000];
        int front = -1, back = -1;
        String str;

        int count = Integer.parseInt(br.readLine());
        int value;

        for (int i = 0; i < count; i++) {
            str = br.readLine();
            if (str.contains("push")) {
                value = Integer.parseInt(str.substring(5));
                queue[++back] = value;
            }
            if (str.equals("pop")) {
                if (back-front==0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue[++front]).append("\n");
                }
            }
            if (str.equals("size")) {
                sb.append(back-front).append("\n");
            }
            if (str.equals("empty")) {
                if (back-front == 0) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            if (str.equals("front")) {
                if (back-front == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue[front + 1]).append("\n");
                }
            }
            if (str.equals("back")) {
                if (back-front == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue[back]).append("\n");
                }
            }
        }

        System.out.println(sb);

        /*
        push X: 정수 X를 큐에 넣는 연산이다.
        pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        size: 큐에 들어있는 정수의 개수를 출력한다.
        empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
        front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        */
    }
}
