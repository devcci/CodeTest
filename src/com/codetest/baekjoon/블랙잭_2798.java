package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 블랙잭_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        int sum = 0;
        for (int i = 0; i < N - 2; i++) {
            if (cards[i] > M) continue;
            for (int j = i + 1; j < N - 1; j++) {
                if (cards[j] + cards[i] > M) continue;
                for (int k = j + 1; k < N; k++) {
                    int temp = cards[k] + cards[j] + cards[i];
                    if (temp == M) {
                        bw.write(temp + "\n");
                        bw.flush();
                        bw.close();
                        return;
                    }
                    if (sum < temp && temp < M)
                        sum = temp;
                }
            }
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}
