package com.codetest.baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 게임_1072_unfix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int answer = 0;
        int ratio = (int) ((long) y * 100 / x);

        if(x==y){
            System.out.println(-1);
            return;
        }

        while (true) {
            int tempRatio =(int) ((long) y * 100 / x);
            if (ratio != tempRatio) {
                System.out.println(answer);
                return;
            }

            y++;
            x++;

            answer++;

        }
    }
}
