package com.codetest.programmers;
public class test10 {

    public static void main(String[] args) {
        int[] numbers = { 3, 30, 34, 5, 9 };

        String str = "";
        for (int i = 0; i < numbers.length; i++) {
            str += numbers[i];
        }
        System.out.println(Integer.parseInt(str));
    }
}
