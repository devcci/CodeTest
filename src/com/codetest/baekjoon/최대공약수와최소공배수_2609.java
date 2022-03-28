package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 최대공약수와최소공배수_2609 {
    /*
     * https://sectumsempra.tistory.com/77
     * 공식 활용해야하는데 모르면 나가 죽자
     * 아래 코드가 좋음
     * */
    /*public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a%b);
    }
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(gcd(a,b));
        System.out.println(a*b/gcd(a,b));
        */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int maxCommonFactor = 0;
        int leastCommonMultiple = 0;
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int temp = max % min;
        while (temp != 0) {
            max = min;
            min = temp;
            temp = max % min;
        }
        maxCommonFactor = min;
        leastCommonMultiple = (n * m) / maxCommonFactor;
        bw.write(maxCommonFactor + "\n");
        bw.write(leastCommonMultiple + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
