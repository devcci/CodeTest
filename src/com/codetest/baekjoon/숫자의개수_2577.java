package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 숫자의개수_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10];
        int multiplyNum = 1;
        for (int i = 0; i < 3; i++) {
            multiplyNum *= Integer.parseInt(br.readLine());
        }
        while (multiplyNum > 0) {
            int moduloNum = multiplyNum % 10;
            multiplyNum /= 10;
            arr[moduloNum]++;
        }
        for (int i : arr) {
            bw.write(i + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
