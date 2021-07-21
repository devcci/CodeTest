package com.codetest.cospro;

import java.util.Arrays;
import java.util.Stack;

/**
 * Cos Pro 숫자 뽑기(프로그래머스)
 */
public class NumberPick {
    public int solution(int[] arr, int K) {
        // 여기에 코드를 작성해주세요.
        int answer = 10000;

        Arrays.sort(arr);
        int dif = 0;
        for (int i = 0; i < arr.length - (K - 1); i++) {
            dif = arr[i + K - 1] - arr[i];
            if (answer > dif) {
                answer = dif;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        NumberPick sol = new NumberPick();
        int[] arr = { 9, 11, 9, 6, 4, 19 };
        int K = 4;
        int ret = sol.solution(arr, K);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
    }
}
