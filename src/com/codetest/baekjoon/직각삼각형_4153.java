package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 직각삼각형_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0 && C == 0) break;
            int[] S = new int[3];
            S[0] = A;
            S[1] = B;
            S[2] = C;
            Arrays.sort(S);

            if (Math.pow(S[0], 2) + Math.pow(S[1], 2) == Math.pow(S[2], 2)) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
