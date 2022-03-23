package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//https://st-lab.tistory.com/261
//너무 무식하게 풀었다 이진탐색 활용하자
public class 수찾기_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            boolean flag = false;
            for (int j = 0; j < N; j++) {
                if (B[i] == A[j]) {
                    {
                        bw.write("1\n");
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                flag = false;
                bw.write(("0\n"));
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
