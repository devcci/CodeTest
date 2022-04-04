package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 균형잡힌세상_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String temp = "";
        while (true) {
            Stack<Character> stack = new Stack<>();
            temp = br.readLine();
            if (temp.equals(".")) break;
            char[] chars = temp.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '(' || chars[i] == '[') {
                    stack.push(chars[i]);
                } else if (chars[i] == ')') {
                    if (stack.empty() || stack.peek() != '(') {
                        bw.write("no\n");
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (chars[i] == ']') {
                    if (stack.empty() || stack.peek() != '[') {
                        bw.write("no\n");
                        break;
                    } else {
                        stack.pop();
                    }
                }

                if (i == chars.length - 1 && stack.empty()) {
                    bw.write("yes\n");
                    break;
                } else if (i == chars.length - 1) {
                    bw.write("no\n");
                    break;
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
