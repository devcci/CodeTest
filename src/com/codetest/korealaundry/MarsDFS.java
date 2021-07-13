//import java.util.LinkedList;
package com.codetest.korealaundry;
public class MarsDFS {
    // 코리아 런드리 코딩테스트
    // DFS, BFS 이용한 최단거리
    public int solution(int[][] board, int c) {
        // int mapSizeX;
        // int mapSizeY;
        // int[] curLoc;
        // int[] target;
        int move = 0;
        int answer = 0;
        // curLoc = new int[2];
        // target = new int[2];
        // mapSizeY = board.length / board[0].length;
        // mapSizeX = board[0].length;

        // // 출발지 목적지 포착
        // for (int i = 0; i < board.length; i++) {
        // for (int j = 0; j < board[i].length; j++) {
        // if (board[i][j] == 2) {
        // curLoc[0] = i;
        // curLoc[1] = j;
        // }
        // if (board[i][j] == 3) {
        // target[0] = i;
        // target[1] = j;
        // }
        // }
        // }

        // // 최단거리(장애물 상관X)
        // for (int i = 0; i < board.length; i++) {
        // if (curLoc[0] < target[0]) {
        // curLoc[0]++;
        // move++;
        // if (board[curLoc[0]][curLoc[1]] == 1) {
        // move += c;
        // }
        // board[curLoc[0]][curLoc[1]] = 2;
        // } else if (curLoc[0] == target[0]) {
        // continue;
        // } else {
        // curLoc[0]--;
        // if (board[curLoc[0]][curLoc[1]] == 1) {
        // move += c;
        // } else {
        // move++;
        // }
        // board[curLoc[0]][curLoc[1]] = 2;
        // }

        // if (curLoc[1] < target[1]) {
        // curLoc[1]++;
        // move++;
        // if (board[curLoc[0]][curLoc[1]] == 1) {
        // move += c;
        // }

        // board[curLoc[0]][curLoc[1]] = 2;
        // } else if (curLoc[1] == target[1]) {
        // continue;
        // } else {
        // curLoc[1]--;
        // if (board[curLoc[0]][curLoc[1]] == 1) {
        // move += c;
        // } else {
        // move++;
        // }
        // board[curLoc[0]][curLoc[1]] = 2;
        // }
        // }

        // for (int i = 0; i < board.length; i++) {
        // if (curLoc[0] < target[0]) {
        // curLoc[0]++;
        // move++;
        // if (board[curLoc[0]][curLoc[1]] == 1) {
        // move += c;
        // }
        // board[curLoc[0]][curLoc[1]] = 2;
        // } else if (curLoc[0] == target[0]) {
        // continue;
        // } else {
        // curLoc[0]--;
        // if (board[curLoc[0]][curLoc[1]] == 1) {
        // move += c;
        // } else {
        // move++;
        // }
        // board[curLoc[0]][curLoc[1]] = 2;
        // }

        // if (curLoc[1] < target[1]) {
        // curLoc[1]++;
        // move++;
        // if (board[curLoc[0]][curLoc[1]] == 1) {
        // move += c;
        // }

        // board[curLoc[0]][curLoc[1]] = 2;
        // } else if (curLoc[1] == target[1]) {
        // continue;
        // } else {
        // curLoc[1]--;
        // if (board[curLoc[0]][curLoc[1]] == 1) {
        // move += c;
        // } else {
        // move++;
        // }
        // board[curLoc[0]][curLoc[1]] = 2;
        // }
        // }
        answer = move;
        return answer;
    }

    // void findRoute(){
    // LinkedList<Integer> queue = new LinkedList<Integer>();
    // boolean v[] = new boolean[];
    // }
    public static void main(String[] args) {
        MarsDFS marsDFS = new MarsDFS();
        int[][] board = { { 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 1, 1, 1, 0, 0 }, { 0, 0, 1, 1, 1, 1, 1, 0, 1, 0 }, { 0, 0, 1, 1, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 3, 0, 0, 0, 1, 0 } };
        int c = 2;
        System.out.println(marsDFS.solution(board, c));
    }
}
