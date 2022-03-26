package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 소수찾기_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            boolean flag = true;
            if (n == 1) continue;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) count++;
        }
        bw.write(count + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
