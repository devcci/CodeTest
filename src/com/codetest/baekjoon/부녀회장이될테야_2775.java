package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 부녀회장이될테야_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[] k = new int[T];
        int[] n = new int[T];
        for (int i = 0; i < T; i++) {
            k[i] = Integer.parseInt(br.readLine());
            n[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < T; i++) {
            int[][] kn = new int[k[i] + 1][n[i]];
            for (int j = 0; j < n[i]; j++) {
                kn[0][j] = j + 1;
            }
            for (int j = 1; j <= k[i]; j++) {
                int floorSum = 0;
                for (int l = 0; l < n[i]; l++) {
                    floorSum = floorSum + kn[j - 1][l];
                    kn[j][l] = floorSum;
                }
            }
            bw.write(kn[kn.length - 1][kn[kn.length - 1].length - 1] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
