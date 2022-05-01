package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 피보나치함수_1003 {
    static int a;
    static int b;
    static int abSum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            bw.write(a + " " + b + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void fibonacci(int n) {
        a = 1;
        b = 0;
        abSum = 1;
        for (int i = 0; i < n; i++) {
            a = b;
            b = abSum;
            abSum = a + b;
        }
    }
}
