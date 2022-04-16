package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 이항계수1_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int top = 1;
        int bot1 = 1;
        int bot2 = 1;
        for (int i = 1; i <= N; i++) {
            top *= i;
        }
        for (int i = 1; i <= K; i++) {
            bot1 *= i;
        }
        for (int i = 1; i <= N - K; i++) {
            bot2 *= i;
        }
        bw.write(top / (bot1 * bot2) + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
