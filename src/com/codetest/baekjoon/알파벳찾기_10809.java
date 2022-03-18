package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 알파벳찾기_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int[] alphabetArr = new int[26];
        Arrays.fill(alphabetArr, -1);
        for (int i = 0; i < str.length(); i++) {
            if (alphabetArr[str.charAt(i) - 'a'] == -1) alphabetArr[str.charAt(i) - 'a'] = i;
        }

        for (int i : alphabetArr) {
            bw.write(i + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
