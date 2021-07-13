package com.codetest.programmers;
import java.util.HashMap;

public class test16 {
    // 전화번호 목록
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, String> hashMap = new HashMap<String, String>();

        for (int i = 0; i < phone_book.length; i++) {
            hashMap.put(phone_book[i], "prefix");
        }

        for (String phone : phone_book) {
            for (int i = 0; i < phone.length(); i++) {
                if (hashMap.containsKey(phone.substring(0, i))) {
                    answer = false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = { "12", "123", "1235", "567", "88" };
        System.out.println(solution(phone_book));
    }
}
