package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 개미_3048 {
    public static class Ant {
        char name;
        int direction;

        public Ant(char name, int direction) {
            this.name = name;
            this.direction = direction;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int antNum1 = Integer.parseInt(st.nextToken());
        int antNum2 = Integer.parseInt(st.nextToken());
        Ant[] group1 = new Ant[antNum1];
        Ant[] group2 = new Ant[antNum2];
        str = br.readLine();
        for (int i = 0; i < group1.length; i++) {
            group1[i] = new Ant(str.charAt(antNum1-i-1), 1);
        }
        str = br.readLine();
        for (int i = 0; i < group2.length; i++) {
            group2[i] = new Ant(str.charAt(i), -1);
        }

        Ant[] arr = new Ant[antNum1 + antNum2];
        for(int i=0; i<antNum1; i++) arr[i] = group1[i];
        for(int i=antNum1; i<antNum1+antNum2; i++) arr[i] = group2[i-antNum1];
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Ant[] cur = arr.clone();
            for (int j = 0; j < antNum1 + antNum2 - 1; j++) {
                if (cur[j].direction == 1 && cur[j + 1].direction == -1) {
                    Ant tmp = cur[j];
                    arr[j] = cur[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Ant ant : arr) {
            sb.append(ant.name);
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
