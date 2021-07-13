package com.codetest.stratoit;

/**
 * 폭탄 넘기기
 * n 사람 수 m번 폭탄 받았을때 터짐 k 넘기는 수
 * 사람은 1번부터 n번까지 시계방향으로 앉음
 * 홀수일때 시계방향으로 k만큼 넘기고 짝수일떄 반시계 방향으로 k 만큼 넘김
 */
public class Strato1 {
    public int solution(int n, int m, int k) {
        int answer = 0;
        int cnt = 0;
        int bombpos = 1;
        int[] nArr;
        nArr = new int[n+1];
        while (true) {
            if (bombpos > n) {
                bombpos = Math.abs(n - bombpos);
            } else if (bombpos < 0) {
                bombpos = n + bombpos;
            } else if (bombpos == 0) {
                bombpos = n;
            }
            nArr[bombpos] = nArr[bombpos]+ 1;
            if (nArr[bombpos] == m) {
                answer = cnt;
                return answer;
            }
            if (nArr[bombpos] % 2 == 0) {
                bombpos = (bombpos - k);
            } else {
                bombpos = (bombpos + k);
            }
            cnt++;
        }
    }

    public static void main(String[] args) {
        Strato1 s = new Strato1();
        System.out.println(s.solution(3, 3, 2));
    }
}
