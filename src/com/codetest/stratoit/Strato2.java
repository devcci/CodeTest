package com.codetest.stratoit;

/**
 * +- 이용하여 주어진 수로 0을 만들 수 있는 경우의 수 구하기
 */
public class Strato2 {
    public int solution(int[] numbers) {
        int answer = 0;
        answer += dfs(numbers[0], 1, numbers);
        answer += dfs(-numbers[0], 1, numbers);
        return answer;
    }

    public int dfs(int prev, int index, int[] numbers) {
        int answer = 0;
        if (index >= numbers.length) {
            if (prev == 0) {
                return 1;
            }
            return 0;
        }
        int cursu1 = prev + numbers[index];
        int cursu2 = prev - numbers[index];
        answer += dfs(cursu1, index + 1, numbers);
        answer += dfs(cursu2, index + 1, numbers);

        return answer;
    }

    public static void main(String[] args) {
        Strato2 s = new Strato2();
        int[] numbers = { 8, 3, 5, 7, 3, 4 };
        System.out.println(s.solution(numbers));
    }
}
