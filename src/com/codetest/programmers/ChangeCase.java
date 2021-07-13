package com.codetest.programmers;
/**
 * 홀수 대문자 짝수 소문자 변환
 */
public class ChangeCase {
    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (arr[i].contains(" ")) {
                cnt = 0;
            } else {
                cnt++;
                ;
            }
            if (cnt % 2 == 0) {
                answer += arr[i].toLowerCase();
            } else {
                answer += arr[i].toUpperCase();
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }
}
