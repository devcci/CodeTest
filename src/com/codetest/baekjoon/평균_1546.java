package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] scoreArr = new double[N];
        double scoreSum = 0;
        double M = 0;
        for (int i = 0; i < N; i++) {
            scoreArr[i] = Double.parseDouble(st.nextToken());
        }
        M = scoreArr[0];
        for (int i = 0; i < N - 1; i++) {
            M = Math.max(M, scoreArr[i + 1]);
        }
        for (double i : scoreArr) {
            scoreSum += ((i / M) * 100);
        }
        double average = scoreSum / N;
        System.out.print(average);
        br.close();
    }
}
