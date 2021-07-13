package com.codetest.korealaundry;
public class DialLock {
    // 코리아런드리 코딩테스트
    // 다이얼 최단 거리
    public int solution(String p, String s) {
        int answer = 0;
        for (int i = 0; i < p.length(); i++) {
            int cnt1 = 0;
            int cnt2 = 0;
            int num = p.charAt(i) - '0';
            while (true) {
                if (num > 9) {
                    num = num - 10;
                }
                if (num == s.charAt(i) - '0') {
                    break;
                }
                num++;
                cnt1++;
            }

            num = p.charAt(i) - '0';
            while (true) {
                if (num < 0) {
                    num = num + 10;
                }
                if (num == s.charAt(i) - '0') {
                    break;
                }
                num--;
                cnt2++;
            }
            if (cnt1 > cnt2) {
                answer += cnt2;
            } else {
                answer += cnt1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        DialLock dialLock  = new DialLock();
        System.out.println(dialLock.solution("5", "12"));
    }
}