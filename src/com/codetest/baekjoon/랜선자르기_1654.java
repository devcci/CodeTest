package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 랜선자르기_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] cableArr = new int[K];
        for (int i = 0; i < K; i++) {
            cableArr[i] = Integer.parseInt(br.readLine());
        }
        long max = cableArr[0];
        long min = 1;
        long mid = 0;

        for (int i = 1; i < K; i++) {
            max = Math.max(cableArr[i], max);
        }
        while (min <= max) {
            long maxCut = 0;
            mid = (max + min) / 2;

            for (int i = 0; i < K; i++) {
                maxCut += cableArr[i] / mid;
            }
            if (maxCut >= N) min = mid + 1;
            else max = mid - 1;
        }
        bw.write(max + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
