package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 최댓값_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int maxIndex = 0;
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxNum = Math.max(maxNum, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxNum) maxIndex = i+1;
        }
        bw.write(maxNum + "\n");
        bw.write(maxIndex + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
