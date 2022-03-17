package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 상수_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String input = br.readLine();
//        StringTokenizer st = new StringTokenizer(input);
//        String str1 = st.nextToken();
//        String str2 = st.nextToken();
//        String reverse1 = "";
//        String reverse2 = "";
//        for (int i = str1.length() - 1; i >= 0; i--) {
//            reverse1 += str1.charAt(i);
//            reverse2 += str2.charAt(i);
//        }
//        if (Integer.parseInt(reverse1) > Integer.parseInt(reverse2)) bw.write(reverse1 + "\n");
//        else bw.write(reverse2 + "\n");
        StringTokenizer st = new StringTokenizer( br.readLine() );
        String words1 = st.nextToken();
        String words2 = st.nextToken();

        int a = Integer.parseInt( new StringBuilder( words1 ).reverse().toString() );
        int b = Integer.parseInt( new StringBuilder( words2 ).reverse().toString() );

        if( a > b ) {
            System.out.print( a );
        } else {
            System.out.print( b );
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
