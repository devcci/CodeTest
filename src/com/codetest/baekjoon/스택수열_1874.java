package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 스택수열_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] N = new int[n];
        for (int i = 0; i < n; i++) {
            N[i] = Integer.parseInt(br.readLine());
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (N[i] > index) {
                for (int j = index + 1; j <= N[i]; j++) {
                    stack.push(j);
                    sb.append("+\n");

                }
                index = N[i];
            } else if (stack.peek() != N[i]) {
                sb.setLength(0);
                sb.append("NO\n");
                break;
            }
            stack.pop();
            sb.append(("-\n"));
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
