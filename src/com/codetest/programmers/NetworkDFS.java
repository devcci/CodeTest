package com.codetest.programmers;
public class NetworkDFS {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean visited[];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                dfs(i, computers, visited);
                answer++;
            }
        }

        return answer;
    }

    public void dfs(int node, int[][] computers, boolean[] visited) {
        visited[node] = true;

        for (int i = 0; i < computers.length; i++) {
            if (i != node && computers[node][i] == 1 && visited[i] == false) {
                dfs(i, computers, visited);
            }
        }
    }
}
