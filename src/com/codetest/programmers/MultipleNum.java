package com.codetest.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 두 배열을 서로 곱한 값이 최소값으로 나와야함
 */
public class MultipleNum {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        MultipleNum multipleNum = new MultipleNum();
        int[] a = { 1, 4, 2 };
        int[] b = { 5, 4, 4 };
        System.out.println(multipleNum.solution(a, b));

    }
}
