package com.codetest.programmers;
import java.util.Arrays;

/* 프로그래머스 소수 만들기 */
public class createSosu {
    public static int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean tf = true;
                    for (int s = 2; s < sum; s++) {
                        if (sum % s == 0) {
                            tf = false;
                            break;
                        }
                    }
                    if (tf) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return answer;
    }

    public static void main(String[] args) {
        int[] num = { 1, 2, 7, 6, 4 };
        System.out.println(solution(num));
    }
}
