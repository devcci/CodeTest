package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 음계_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] input = new int[8];
        for (int i = 0; i < 8; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        String result = "";
        for (int i = 0; i < 7; i++) {
            if (input[i] == input[i + 1] - 1) {
                result = "ascending";
            } else if (input[i] == input[i + 1] + 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }
        bw.write(result + "\n");
        bw.write("");
        br.close();
        bw.flush();
        bw.close();
    }
}
