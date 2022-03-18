package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusBminus4_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=null;
        String str="";
        // 테스트케이스가 여러개지만 끝을 안알려줘서
        // 마지막을 null로 가정하고 종료되게함
       while((str = br.readLine())!= null){
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
