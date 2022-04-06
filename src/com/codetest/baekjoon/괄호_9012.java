package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 괄호_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack;
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            stack = new Stack<>();
            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);
                if (ch == '(') {
                    stack.push(input.charAt(j));
                } else if (ch == ')') {
                    if (!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        bw.write("NO\n");
                        break;
                    }
                }
                if (stack.empty() && j == input.length() - 1) {
                    bw.write("YES\n");
                } else if (j == input.length() - 1) {
                    bw.write("NO\n");
                }

            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
