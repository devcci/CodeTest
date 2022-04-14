package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 덱_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque deque = new Deque();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front":
                    deque.push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    bw.write(deque.pop_front() + "\n");
                    break;
                case "pop_back":
                    bw.write(deque.pop_back() + "\n");
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    bw.write(deque.empty() + "\n");
                    break;
                case "front":
                    bw.write(deque.front() + "\n");
                    break;
                case "back":
                    bw.write(deque.back() + "\n");
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }

    static class Deque {
        LinkedList<Integer> list = new LinkedList<>();

        void push_front(int num) {
            list.addFirst(num);
        }

        void push_back(int num) {
            list.addLast(num);
        }

        int pop_front() {
            return list.isEmpty() ? -1 : list.pollFirst();
        }

        int pop_back() {
            return list.isEmpty() ? -1 : list.pollLast();
        }

        int size() {
            return list.size();
        }

        int empty() {
            return list.isEmpty() ? 1 : 0;
        }

        int front() {
            return list.isEmpty() ? -1 : list.peekFirst();
        }

        int back() {
            return list.isEmpty() ? -1 : list.peekLast();
        }
    }
}

