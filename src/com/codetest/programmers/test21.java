package com.codetest.programmers;
import java.util.Arrays;
import java.util.Comparator;

public class test21 {

    public static String[] solution(String[] files) {
        String[] answer = {};

        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        return answer;
    }

    public static void main(String[] args) {
        String[] files = { "img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG" };
        System.out.println(solution(files));
    }
}
