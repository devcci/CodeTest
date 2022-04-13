package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 큐_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        LinkedList<Integer> myQueue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            switch (command) {
                case "push":
                    myQueue.add(num);
                    break;
                case "pop":
                    if (myQueue.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(myQueue.poll() + "\n");
                    }
                    break;
                case "size":
                    bw.write(myQueue.size() + "\n");
                    break;
                case "empty":
                    if (myQueue.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "front":
                    if (myQueue.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(myQueue.peekFirst() + "\n");
                    }
                    break;
                case "back":
                    if (myQueue.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(myQueue.peekLast() + "\n");
                    }
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
