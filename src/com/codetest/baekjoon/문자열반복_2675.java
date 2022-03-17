package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 문자열반복_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String[][] S = new String[T][2];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            S[i][0] = st.nextToken();
            S[i][1] = st.nextToken();
        }
        for (int i = 0; i < T; i++) {
            char[] chars = S[i][1].toCharArray();
            for (char aChar : chars) {
                for (int k = 0; k < Integer.parseInt(S[i][0]); k++) {
                    bw.write(aChar);
                }
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
