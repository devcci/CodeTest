package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


/*스택을 스택으로 해버리니 이상하다
 * 나중에 스택 클래스 만들어가지고 배열로 자체적으로 스택 구현해보자
 * */
public class 스택_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            switch (command) {
                case "push":
                    stack.push(num);
                    break;
                case "pop": {
                    if (stack.empty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.pop() + "\n");
                    }
                    break;
                }
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty": {
                    if (stack.empty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                }
                case "top": {
                    if (stack.empty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(stack.peek() + "\n");
                    }
                    break;
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
