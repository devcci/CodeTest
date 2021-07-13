package com.codetest.programmers;
/**
 * 자료구조 DFS 탐색 연습
 */
public class DFSexercise {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(1, numbers[0], numbers, target) + dfs(1, -numbers[0], numbers, target);
        return answer;
    }

    public int dfs(int cur, int next, int[] numbers, int target) {
        int result = 0;
        if (cur == numbers.length) {
            if (next == target) {
                return 1;
            } else {
                return 0;
            }
        }

        result += dfs(cur + 1, next + numbers[cur], numbers, target);
        result += dfs(cur + 1, next - numbers[cur], numbers, target);
        return result;
    }

    public static void main(String[] args) {
        DFSexercise dfsExercise = new DFSexercise();
        int[] numbers = { 1, 1, 1, 1, 1 };
        int target = 3;
        System.out.println("타겟 넘버 만드는 경우의 수: " + dfsExercise.solution(numbers, target));
    }
}