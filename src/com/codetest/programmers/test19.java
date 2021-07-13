package com.codetest.programmers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class test19 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 2;
        ArrayList<Integer> tList = new ArrayList<Integer>();
        ArrayList<Integer> doList = new ArrayList<Integer>();
        HashMap<Integer, Integer> doMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < truck_weights.length; i++) {
            tList.add(truck_weights[i]);
        }

        int nowWeight = 0;
        while (true) {
            int tfirst = 0;
            try {
                tfirst = tList.get(0);
            } catch (Exception e) {
                tList.clear();
            } finally {
                if (nowWeight + tfirst <= weight && !tList.isEmpty()) {
                    doList.add(tList.get(0));
                    nowWeight += tList.get(0);
                    doMap.put(answer, 0);
                    tList.remove(0);
                }
            }

            Iterator<Integer> itl = doMap.keySet().iterator();
            while (itl.hasNext()) {
                int temp = itl.next();
                doMap.put(temp, doMap.get(temp) + 1);
                if (doMap.get(temp) == bridge_length) {
                    nowWeight -= doList.get(0);
                    doList.remove(0);
                    doMap.remove(temp);
                    itl = doMap.keySet().iterator();
                }
            }

            if (tList.isEmpty() && doList.isEmpty()) {
                break;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        System.out.println(solution(bridge_length, weight, truck_weights));
    }
}
