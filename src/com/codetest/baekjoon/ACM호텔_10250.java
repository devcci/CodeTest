package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ACM호텔_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int h = N % H;
            if (h == 0) h = H;
            int w = 0;
            for (int j = 1; j <= W; j++) {
                if (N <= H * j) {
                    w = j;
                    break;
                }
            }
            String temp = String.format("%02d", w);

            bw.write(h + temp + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
