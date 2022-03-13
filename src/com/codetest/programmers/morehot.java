package com.codetest.programmers;

import java.util.*;

public class morehot {
    public static int solution(int[] scoville, int K) {
        ArrayList<Integer> scovilleList = new ArrayList<>();
        for (int j : scoville) {
            scovilleList.add(j);
        }

        int answer = 0;
        while (true) {
            Collections.sort(scovilleList);
            boolean flag = true;

            for (Integer integer : scovilleList) {
                if (integer < K) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                break;
            } else if (scovilleList.size() < 2) {
                return -1;
            } else {
                answer++;
                int tmp;
                tmp = scovilleList.get(0) + (scovilleList.get(1) * 2);
                scovilleList.remove(0);
                scovilleList.set(0, tmp);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        System.out.println(solution(scoville, 7));
    }
}
