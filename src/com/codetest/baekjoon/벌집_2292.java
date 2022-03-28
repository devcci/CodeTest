package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 벌집_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int sum = 2;
        int i = 0;
        while (sum <= N) {
            i++;
            sum = sum + (6 * i);

        }
        bw.write(i + 1 + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
