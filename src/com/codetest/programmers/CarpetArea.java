package com.codetest.programmers;
import java.util.*;

public class CarpetArea {
    // https://programmers.co.kr/learn/courses/30/lessons/42842
    // 카펫 넓이
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum = brown + yellow;
        int area = 0;
        for (int i = 1; i < sum; i++) {
            for (int j = 1; j <= i; j++) {
                area = i * j;
                if (sum == area) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CarpetArea carpetArea = new CarpetArea();
        System.out.println(Arrays.toString(carpetArea.solution(24, 24)));
    }

}
