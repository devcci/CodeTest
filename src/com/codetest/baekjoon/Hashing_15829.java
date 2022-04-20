package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hashing_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long sum = 0;
        long r = 1;
        int M = 1234567891;
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        br.close();
        for (int i = 0; i < N; i++) {
            sum += (str.charAt(i) - 'a' + 1) * r;
            sum %= M;
            r *= 31;
            r %= M;
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}
