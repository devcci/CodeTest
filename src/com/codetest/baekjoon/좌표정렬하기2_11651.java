package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class 좌표정렬하기2_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Point[] pArr = new Point[N];
        for (int i = 0; i < N; i++) {
            Point p = new Point();
            StringTokenizer st = new StringTokenizer(br.readLine());
            p.setX(Integer.parseInt(st.nextToken()));
            p.setY(Integer.parseInt(st.nextToken()));
            pArr[i] = p;
        }
        List<Point> pointList = Arrays.asList(pArr);
        pointList.sort(Comparator.comparing(Point::getY).thenComparing(Point::getX));

        for (Point point : pArr) {
            bw.write(point.getX() + " " + point.getY() + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    static class Point {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
