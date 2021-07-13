package com.codetest.programmers;
import java.util.Arrays;

// 주식 가격 스택/큐
public class test12 {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length - 1; i++) {
            int time = 0;
            for (int j = i; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    time++;
                    break;
                } else {
                    time++;
                }
            }
            answer[i] = time - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = { 3, 2, 3, 2, 3 };
        System.out.println(Arrays.toString(solution(prices)));
    }
}
