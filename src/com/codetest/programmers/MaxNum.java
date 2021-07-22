package com.codetest.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNum {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            }
        });

        if (arr[0].equals("0")) {
            return "0";
        }

        for (String s : arr) {
            answer += s;
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxNum maxNum = new MaxNum();
        int[] numbers = { 6, 10, 2 };
        System.out.println(maxNum.solution(numbers));
    }
}
