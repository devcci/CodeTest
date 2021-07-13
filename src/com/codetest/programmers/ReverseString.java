package com.codetest.programmers;
public class ReverseString {
    /**
     * 문자열 뒤집기
     */
    public String solution(String s) {
        String answer = "";
        for (int i = s.length() - 1; i > -1; i--) {
            answer += s.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.solution("abcd"));
    }
}