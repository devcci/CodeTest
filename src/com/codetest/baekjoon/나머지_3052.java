package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 나머지_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int[] input = new int[10];
//        for (int i = 0; i < 10; i++) {
//            input[i] = Integer.parseInt(br.readLine()) % 42;
//        }
//        for (int i = 0; i < 10; i++) {
//            int cur = input[i];
//            for (int j = 0; j < 10; j++) {
//                if (i == j) {
//                    continue;
//                }
//                if (cur == input[j] && input[j] > -1) {
//                    input[i] = -1;
//                }
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            if (input[i] != -1) {
//                sum++;
//            }
//        }
        int[] input = new int[42];
        int count=0;
        for(int i=0; i<10; i++) {
            int N = Integer.parseInt(br.readLine());
            int mod = N%42;
            input[mod]++;
        }
        for(int i=0; i<42;  i++) {
            if(input[i]>0) {
                count++;
            }
        }
        bw.write(count + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
