package com.codetest.programmers;
public class StringCheck {
    /* 문자열 확인 */
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i)) == false) {
                    answer = false;
                }
            }
        } else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        StringCheck stringCheck = new StringCheck();
        System.out.println(stringCheck.solution("a234"));
        System.out.println(stringCheck.solution("1234"));
    }
}
