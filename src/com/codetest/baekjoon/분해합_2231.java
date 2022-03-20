package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 분해합_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int digit = (int) (Math.log10(N) + 1);
        int[] M = new int[digit + 1];
        for (int i = 1; i <= N; i++) {
            M[0] = i;
            int temp = i;
            for (int j = 1; j <= digit; j++) {
                M[j] = temp % 10;
                temp /= 10;
            }
            int sum = 0;
            for (int k = 0; k <= digit; k++) {
                sum += M[k];
            }
            if (N == sum) {
                break;
            } else {
                M[0] = 0;
            }
        }
        bw.write(M[0] + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}

