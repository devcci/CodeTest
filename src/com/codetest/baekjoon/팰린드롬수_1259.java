package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class 팰린드롬수_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> strList = new ArrayList<String>();
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;
            strList.add(str);


        }
        for (String s : strList) {
            boolean flag = true;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt((s.length() - i - 1))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
