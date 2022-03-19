package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 체스판다시칠하기_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        char[][] board = new char[M][N];
        for (int i = 0; i < M; i++) {
            board[i] = br.readLine().toCharArray();
        }
        int min = 10000000;
        for (int i = 0; i < M - 7; i++) {
            for (int j = 0; j < N - 7; j++) {
                int cnt1 = 0;
                int cnt2 = 0;
                char flag = board[i][j];
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l += 2) {
                        if (board[k][l] != flag) {
                            cnt1++;
                        } else {
                            cnt2++;
                        }
                        if (board[k][l + 1] == flag) {
                            cnt1++;
                        } else {
                            cnt2++;
                        }
                    }
                    if (flag == 'W') {
                        flag = 'B';
                    } else {
                        flag = 'W';
                    }
                }
                min = Math.min(Math.min(min, cnt1), cnt2);
            }

        }
        bw.write(min + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
