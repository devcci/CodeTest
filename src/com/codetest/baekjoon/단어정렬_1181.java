package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 단어정렬_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<String> strList = new ArrayList<String>() {
        };
        for (int i = 0; i < N; i++) {
            strList.add(br.readLine());
        }
        Collections.sort(strList);
        for (int i = 1; i <= 50; i++) {
            for (int j = 0; j < strList.size(); ) {
//                if (strList.get(i).length() > strList.get(j).length()) {
//                    String temp = strList.get(i);
//                    strList.set(i, strList.get(j));
//                    strList.set(j, temp);
//                }
                if (strList.get(j).length() == i) {
                    bw.write(strList.get(j) + "\n");
                    strList.removeAll(Arrays.asList(strList.get(j)));
                } else {
                    j++;
                }
            }
            if (strList.isEmpty()) break;
        }
//        for (int i = 0; i < strList.size(); i++) {
//            for (int j = i; j < strList.size(); j++) {
//                if (strList.get(i).length() == strList.get(j).length()) {
//                    int comparedResult = strList.get(i).compareTo(strList.get(j));
//                    if (comparedResult > 0) {
//                        String temp = strList.get(i);
//                        strList.set(i, strList.get(j));
//                        strList.set(j, temp);
//                    }
//                }
//            }
//        }
        br.close();
        bw.flush();
        bw.close();
    }
}
