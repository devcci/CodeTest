package com.codetest.korealaundry;
public class HandShake {
    // 코리아 런드리 코딩테스트
    // 카탈랑 수 [미완]
    public int solution(int n) {
        int answer = 0;
        n *= 2;

        int[] dp = new int[1000];
        dp[0] = 1;
        for (int i = 2; i <= n; i += 2) {
            dp[i] = 0;
            for (int j = 0; j < i - 2; j += 2) {
                dp[i] += dp[j] * dp[i - (j - 1)];
            }
        }
        answer = dp[n];
        return answer;
    }

    public static void main(String[] args) {
        HandShake handShake = new HandShake();
        System.out.println(handShake.solution(4));

    }
}
