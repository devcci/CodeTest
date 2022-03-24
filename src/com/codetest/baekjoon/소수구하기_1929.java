package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 소수구하기_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean[] MN = new boolean[1000001];
        Arrays.fill(MN, false);
        MN[1] = true;
        for (int i = 2; i <= N; i++) {
            if (MN[i]) continue;
            for (int j = 2; i * j <= N; j++) {
                MN[i * j] = true;
            }
        }
        for (int i = M; i <= N; i++) {
            if (!MN[i]) {
                bw.write(i + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
