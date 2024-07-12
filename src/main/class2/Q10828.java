/*
    Date: 2024.07.09
    No: 10828번
    Tier: 실버 IV
    Name: 스택
    Language: Java17
*/

package main.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10828 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] stack = new int[10000];
        int top = -1;
        String str;

        int count = Integer.parseInt(br.readLine());
        int value;

        for (int i = 0; i < count; i++) {
            str = br.readLine();
            if (str.contains("push")) {
                value = Integer.parseInt(str.substring(5));
                stack[++top] = value;
            }
            if (str.equals("pop")) {
                if (top == -1) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack[top--]).append("\n");
                }
            }
            if (str.equals("size")) {
                sb.append(top + 1).append("\n");
            }
            if (str.equals("empty")) {
                if (top == -1) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            if (str.equals("top")) {
                if (top == -1) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack[top]).append("\n");
                }
            }
        }

        System.out.println(sb);

        /*
        push X: 정수 X를 스택에 넣는 연산이다.
        pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        size: 스택에 들어있는 정수의 개수를 출력한다.
        empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
        top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
        */
    }
}
