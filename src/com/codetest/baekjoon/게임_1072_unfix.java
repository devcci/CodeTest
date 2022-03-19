package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 게임_1072_unfix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int answer = -1;
        int left = 0;
        int right = (int)1e9;
        int ratio = (int) ((long) y * 100 / x);
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((int) ((long) (y + mid) * 100 / (x + mid)) != ratio) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        bufferedReader.close();
        bufferedWriter.write(answer + "\n");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
