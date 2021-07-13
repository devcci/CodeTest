package com.codetest.stratoit;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 퀘스트 순서대로 깨기
 * 1부터 n가지의 퀘스트 중 가장 낮은 수 우선으로 깬다.
 * 3번을 깨기 위해 1번 완료가 조건인 경우 {1, 3} 표현
 * 완료 순서 나타내기
 */
public class Strato3 {

    public int[] solution(int n, int[][] quests) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] answer;
        List<Integer> questList = new ArrayList<Integer>();
        List<Integer> complete = new ArrayList<Integer>();

        for (int j = 1; j <= n; j++) {
            questList.add(j);
        }
        stack.push(questList.get(0));
        questList.remove(0);
        while (!stack.isEmpty()) {
            int cnt = 0;
            //boolean sFlag = false;
            for (int i = 0; i < quests.length; i++) {
                if (quests[i][1] == stack.peek()) {
                    for (int j = 0; j < complete.size(); j++) {
                        if (quests[i][0] == complete.get(j)) {
                            complete.add(stack.pop());
                            pushStack(stack, questList);
                            //sFlag = true;
                            break;
                        }
                    }
                    cnt++;
                    break;
                }
            }
            // if (sFlag) {
            //     pushStack(stack, questList);
            // } 
            if(cnt==0) {
                complete.add(stack.pop());
                pushStack(stack, questList);
            }
            // stack.push(item)
        }

        answer = complete.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public void pushStack(Stack<Integer> stack, List<Integer> questList) {
        if (!questList.isEmpty()) {
            stack.push(questList.get(0));
            questList.remove(0);
        }
    }

    public static void main(String[] args) {
        Strato3 s = new Strato3();
        int[][] quests = { { 1, 3 }, { 1, 4 }, { 3, 5 }, { 5, 4 } };
        int[] sol = s.solution(5, quests);
        for (int i : sol) {
            System.out.print(i + " ");
        }
    }
}
