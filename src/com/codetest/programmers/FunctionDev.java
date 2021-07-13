package com.codetest.programmers;
import java.util.LinkedList;

// 기능개발
//https://programmers.co.kr/learn/courses/30/lessons/42586
public class FunctionDev {
    public static int[] solution(int[] progresses, int[] speeds) {
        LinkedList<Integer> jopList = new LinkedList<Integer>();
        LinkedList<Integer> speedList = new LinkedList<Integer>();
        LinkedList<Integer> tempAnswer = new LinkedList<Integer>();

        for (Integer job : progresses) {
            jopList.add(job);
        }
        for (Integer spd : speeds) {
            speedList.add(spd);
        }

        while (jopList.size() != 0) {
            int cnt = 0;
            for (int i = 0; i < jopList.size(); i++) {
                if (jopList.get(i) >= 100) {
                    continue;
                }
                jopList.set(i, jopList.get(i) + speedList.get(i));
            }
            while (true) {
                if (!jopList.isEmpty() && jopList.getFirst() >= 100) {
                    jopList.remove(0);
                    speedList.remove(0);
                    cnt++;
                } else {
                    break;
                }
            }
            if (cnt != 0) {
                tempAnswer.add(cnt);
            }
        }
        int[] answer = new int[tempAnswer.size()];
        for (int i = 0; i < tempAnswer.size(); i++) {
            answer[i] = tempAnswer.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = { 95, 90, 99, 99, 80, 99 };
        int[] speeds = { 1, 1, 1, 1, 1, 1 };
        System.out.println(solution(progresses, speeds));
    }
}
