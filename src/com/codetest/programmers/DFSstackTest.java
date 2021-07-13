package com.codetest.programmers;
import java.util.Scanner;
import java.util.Stack;

/**
 * DFStest
 * 기본 DFS 연습
 * 스택 이용
 */
public class DFSstackTest {

    private static int[][] treeMap; // 행렬
    private static boolean[] visited; // 방문 노드 저장
    private static int MAX_N; // 최대 노드 수
    private static int MAX_M; // 최대 간선 수

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("노드 갯수 입력 ");
        MAX_N = scan.nextInt();
        System.out.print("간선 갯수 입력 ");
        MAX_M = scan.nextInt();
        treeMap = new int[MAX_N][MAX_N];
        visited = new boolean[MAX_N];

        System.out.println("노드간 간선 입력(정점은 0으로 시작) 1->2 == 1 2");
        for (int i = 0; i < MAX_M; i++) {
            int start = 0, end = 0;

            start = scan.nextInt();
            end = scan.nextInt();

            treeMap[start][end] = 1;
            treeMap[end][start] = 1;
        }
        scan.close();
        /* 행렬 출력 */
        System.out.println("2차원 행렬 출력");
        for (int i = 0; i < treeMap.length; i++) {
            int[] inArr = treeMap[i];
            for (int j = 0; j < inArr.length; j++) {
                System.out.print(inArr[j] + " ");
            }
            System.out.println();
        }

        System.out.println("Depth First Search 알고리즘 통한 방문 순서");
        dfs(0);

    }

    public static void dfs(int node) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(node);
        visited[node] = true;
        System.out.print(node + " ");

        while (!stack.isEmpty()) {
            for (int i = 0; i < MAX_N; i++) {
                if (treeMap[node][i] == 1 && visited[i] == false) {
                    stack.push(i);
                    visited[i] = true;
                    dfs(i);
                }
            }
            stack.pop();
        }
    }
}