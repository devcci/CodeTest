package com.codetest.programmers;
import java.util.Arrays;
import java.util.Comparator;

public class test9 {
    public static String solution(int[] numbers) {
        String answer = new String();
        String str_numbers[] = new String[numbers.length];
        for(int i=0; i<str_numbers.length; i++) {
            str_numbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str_numbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        if(str_numbers[0].startsWith("0")) { 
            answer += "0";
        } else {
            for(int j=0; j<str_numbers.length; j++) {
                answer += str_numbers[j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers));
    }
}
