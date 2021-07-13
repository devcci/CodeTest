package com.codetest.programmers;
public class CenterChar {
    /* 가운데 글자 가져오기 */
    public String solution(String s) {
        String answer = "";

        int len = s.length();
        int hlen = len / 2;

        if (len % 2 == 0) {
            answer = s.substring(hlen - 1, hlen + 1);
        } else {
            answer = s.substring(hlen, hlen + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        CenterChar centerChar = new CenterChar();
        System.out.println(centerChar.solution("hellow"));
    }
}
