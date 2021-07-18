package com.codetest.cospro;

/**
 * Cos Pro 꽃피우기
 */
public class Garden {
    public int solution(int[][] garden) {
        // 여기에 코드를 작성해주세요.

        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden[i].length; j++) {
                if (garden[i][j] == 1) {
                    if (i == 0 && j == garden[i].length - 1) { // 오른쪽 위 모서리
                        garden[i][j - 1] = 1;
                        garden[i + 1][j] = 1;
                        continue;
                    } else if (j == 0 && i == garden.length - 1) { // 오른쪽 위 모서리
                        garden[i - 1][j] = 1; //위
                        garden[i][j + 1] = 1; //오른쪽
                        continue;
                    } else if (i == garden.length - 1 && j == garden[i].length - 1) { // 오른쪽 위 모서리
                        garden[i - 1][j] = 1; //위

                        garden[i][j - 1] = 1; //왼쪽
                        continue;
                    } else if (i == garden.length - 1) { // 오른쪽 위 모서리
                        garden[i - 1][j] = 1; //위
                        garden[i][j + 1] = 1; //오른쪽
                        garden[i][j - 1] = 1; //왼쪽
                        continue;
                    }

                    else if (j == garden[i].length - 1) { // 왼쪽 모서리 처리
                        garden[i - 1][j] = 1; //위
                        garden[i + 1][j] = 1; //아래
                        garden[i][j - 1] = 1; //왼쪽
                        continue;
                    } else if (j == 0) { // 왼쪽 모서리 처리
                        garden[i - 1][j] = 1; //위
                        garden[i + 1][j] = 1; //아래
                        garden[i][j + 1] = 1; //오른쪽
                        continue;
                    } else if (i == 0) { // 위쪽 모서리 처리
                        garden[i][j + 1] = 1;
                        garden[i + 1][j] = 1;
                        continue;
                    } else {

                        garden[i - 1][j] = 1; //위
                        garden[i][j - 1] = 1; //왼쪽
                        garden[i + 1][j] = 1; //아래
                        garden[i][j + 1] = 1; //오른쪽
                    }
                }
            }
        }

        int answer = 0;
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Garden sol = new Garden();
        int[][] garden1 = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        int ret1 = sol.solution(garden1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[][] garden2 = { { 1, 1 }, { 1, 1 } };
        int ret2 = sol.solution(garden2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}
