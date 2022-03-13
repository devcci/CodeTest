package com.codetest.baekjoon;


import java.io.*;

public class 세로읽기_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] array = new char[5][15];

        for (int i = 0; i < array.length; i++) {
            String st = br.readLine();
            for (int j = 0; j < st.length(); j++) {
                array[i][j] = (st.charAt(j));
            }
        }

        for (int i = 0; i < 15; i++) {
            for (char[] chars : array) {
                if (chars[i] == 0) continue;
                bw.write(chars[i]);
            }
        }
        bw.flush();
        bw.close();
    }
}
