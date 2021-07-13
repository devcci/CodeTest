package com.codetest.programmers;
/**
 * 프로그래머스 타겟 넘버
 * https://programmers.co.kr/learn/courses/30/lessons/43165
 */

public class TargetNumber {
    public int dfs(int prev, int index, int[] numbers, int target) {
        if (index >= numbers.length) {
            if (target == prev) {
                return 1;
            }
            return 0;

        }
        int cur1 = prev + numbers[index];
        int cur2 = prev - numbers[index];
        int ans = 0;
        ans += dfs(cur1, index + 1, numbers, target);
        ans += dfs(cur2, index + 1, numbers, target);
        return ans;
    }

    public int solution(int[] numbers, int target) {
        int current = numbers[0];
        int answer = 0;
        answer += dfs(current, 1, numbers, target);
        answer += dfs(-current, 1, numbers, target);
        return answer;
    }

    public static void main(String[] args) {
        TargetNumber targetNumber = new TargetNumber();
        int[] numbers = { 1, 1, 1, 1, 1 };
        int target = 3;
        System.out.println(targetNumber.solution(numbers, target));
    }

}
