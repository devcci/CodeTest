package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 윷놀이_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int sum = 0;
        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == 0) sum++;
            }
            switch (sum) {
                case 0:
                    bw.write("E");
                    break;
                case 1:
                    bw.write("A");
                    break;
                case 2:
                    bw.write("B");
                    break;
                case 3:
                    bw.write("C");
                    break;
                case 4:
                    bw.write("D");
                    break;
            }
            bw.newLine();
            sum = 0;
        }
        bw.flush();
        bw.close();
    }
}
