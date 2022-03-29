package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//뭔가 시간복잡도 낮추는 방법 있는듯..? 찾아보자
public class 수정렬하기_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        for (int i = 0; i < N; i++) {
           arrN[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arrN);
        for (int i : arrN) {
            bw.write(i+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
