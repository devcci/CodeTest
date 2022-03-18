package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OX퀴즈_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[T];
        for (int i = 0; i < T; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < T; i++) {
            int sum = 0;
            int plus = 1;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    sum = sum + plus;
                    plus++;
                } else {
                    plus = 1;
                }
            }
            bw.write(sum + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
