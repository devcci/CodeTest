package com.codetest.cospro;

import java.util.ArrayList;
import java.util.List;

/**
 * Cos Pro 꽃피우기(프로그래머스)
 */
public class Garden {
    public int solution(int[][] garden) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        // int dy[] = { 1, -1, 0, 0 }; // 동서남북
        // int dx[] = { 0, 0, 1, -1 };
        List<Point> pList = new ArrayList<Point>();
        int cnt = 0;
        int size = 0;
        for (int[] i : garden) {
            for (int j : i) {
                size++;
            }
        }
        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden[i].length; j++) {
                if (garden[i][j] == 1) {
                    pList.add(new Point(i, j));
                    cnt++;
                }
            }
        }

        // while (size > cnt) {
        //     answer++;

        //     List<Point> tempList = new ArrayList<Point>();
        //     for (Point point : pList) {
        //         for (int j = 0; j < 4; j++) {
        //             int x = point.x + dx[j];
        //             int y = point.y + dy[j];

        //             if (x >= 0 && x < garden.length  && y >= 0 && y < garden[x].length ) {
        //                 garden[x][y] = 1;
        //                 tempList.add(new Point(x, y));
        //                 cnt++;
        //             }
        //         }
        //     }
        //     pList.clear();
        //     pList = tempList;
        // }
        // 각 if 이용한 좌우 연산
        while (size > cnt) {
            answer++;
            List<Point> tempList = new ArrayList<Point>();
            for (int i = 0; i < pList.size(); i++) {
                Point p = pList.get(i);

                if (p.x - 1 >= 0 && garden[p.x - 1][p.y] == 0) {
                    garden[p.x - 1][p.y] = 1;
                    tempList.add(new Point(p.x - 1, p.y));
                    cnt++;
                }
                if (p.x + 1 <= garden.length - 1 && garden[p.x + 1][p.y] == 0) {
                    garden[p.x + 1][p.y] = 1;
                    tempList.add(new Point(p.x + 1, p.y));
                    cnt++;
                }
                if (p.y - 1 >= 0 && garden[p.x][p.y - 1] == 0) {
                    garden[p.x][p.y - 1] = 1;
                    tempList.add(new Point(p.x, p.y - 1));
                    cnt++;
                }
                if (p.y + 1 <= garden[p.x].length - 1 && garden[p.x][p.y + 1] == 0) {
                    garden[p.x][p.y + 1] = 1;
                    tempList.add(new Point(p.x, p.y + 1));
                    cnt++;
                }
            }

            pList.clear();
            pList = tempList;
        }
        return answer;
    }

    /**
     * Point
     */
    public class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

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
