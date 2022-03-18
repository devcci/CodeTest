package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 시험성적_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        if (num >= 90) bw.write("A");
        else if (80 <= num) bw.write("B");
        else if (70 <= num) bw.write("C");
        else if (60 <= num) bw.write("D");
        else bw.write("F");
        br.close();
        bw.flush();
        bw.close();
    }
}
