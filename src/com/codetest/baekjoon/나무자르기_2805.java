package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 나무자르기_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] tree = new int[n];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < tree.length; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(tree);
        int low = 0;
        int high = tree[n - 1];
        int result = 0;
        while (low <= high) {
            long total = 0;
            int mid = (low + high) / 2;
            for (int i = 0; i < n; i++) {
                if (tree[i] > mid) {
                    total += tree[i] - mid;
                }
            }
            if (total < m) {
                high = mid - 1;
            } else {
                low = mid + 1;
                result = mid;
            }
        }
        System.out.println(result);
    }
}
