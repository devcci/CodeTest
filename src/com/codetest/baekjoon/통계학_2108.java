package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 통계학_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            arr[i] = value;
            sum += value;
        }

        Arrays.sort(arr);

        boolean flag = false;
        int mode_max = 0;
        int mode = 10000;

        for (int i = 0; i < N; i++) {
            int jump = 0;    // 동일한 수가 나온만큼 i 값 jump 시킬 변수
            int count = 1;
            int i_value = arr[i];

            for (int j = i + 1; j < N; j++) {
                if (i_value != arr[j]) {
                    break;
                }
                count++;
                jump++;
            }

            if (count > mode_max) {
                mode_max = count;
                mode = i_value;
                flag = true;
            } else if (count == mode_max && flag == true) {
                mode = i_value;
                flag = false;
            }

            i += jump;
        }
        bw.write((int) Math.round((double) sum / N) + "\n");
        bw.write(arr[N / 2] + "\n");
        bw.write(mode + "\n");
        bw.write(arr[N - 1] - arr[0] + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
