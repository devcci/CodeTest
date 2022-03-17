package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 윤년_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        if ((input % 4 == 0 && input % 100 != 0) || input % 400 == 0) bw.write(1 + "\n");
        else bw.write(0 + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
