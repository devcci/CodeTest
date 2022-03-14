package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class 단어공부_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] input = br.readLine().toCharArray();
        Integer[] count = new Integer[26];
        Arrays.fill(count, 0);
        Arrays.sort(input);
        for (char item : input) {
            item = Character.toUpperCase(item);
            count[item - 'A']++;
        }
        int max = 0;
        char result = ' ';
        for (int i = 1; i < count.length; i++) {
            if (count[max] < count[i]) {
                max = i;
            }
        }
        Arrays.sort(count, Collections.reverseOrder());
        if (count[0].equals(count[1])) {
            result = '?';
        } else {
            result = (char) (max + 'A');
        }

        bw.write(result);

        br.close();
        bw.flush();
        bw.close();
    }
}

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    String input = br.readLine();
//    int[] result = new int[(int)'z' - (int)'a' + 1];
//        for(int i = 0; i < input.length(); i++){
//        if(input.charAt(i) >= 'a') result[(int)input.charAt(i)-(int)'a']++;
//        else result[(int)input.charAt(i)-(int)'A']++;
//        }
//        int[] temp = result.clone();
//        Arrays.sort(temp);
//        if(temp[temp.length-1] == temp[temp.length-2]) bw.write("?");
//        else{
//        for(int i = 0; i < result.length; i++){
//        if(result[i] == temp[temp.length-1]) bw.write((char)i+'A');
//        }
//        }
//
//        bw.close();
//        br.close();



//
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int[] arr = new int[26];
//    String str = br.readLine();
//        for(int i =0; i<str.length(); i++) {
//        if(str.charAt(i)>=65 && str.charAt(i)<=90){
//        arr[str.charAt(i)-65]++;
//        } else {
//        arr[str.charAt(i)-97]++;
//        }
//        }
//        int max = -1;
//        char ch = '?';
//        for(int i=0;i<26;i++){
//        if(arr[i]>max){
//        max = arr[i];
//        ch = (char) (i+65);
//        } else if(max == arr[i]){
//        ch = '?';
//        }
//        }
//        System.out.println(ch);
