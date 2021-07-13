package com.codetest.programmers;
import java.util.ArrayList;

/**
 * test20
 */
public class test20 {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        ArrayList<Integer> timer = new ArrayList<Integer>();
        int weightSum = 0;
        int i = 0;
        ArrayList<Integer> truckList = new ArrayList<Integer>();
        for (int truck : truck_weights) {
            truckList.add(truck);
        }
        ArrayList<Integer> doList = new ArrayList<Integer>();
        while (true) {
            answer++;
            if (truck_weights.length > i) {
                if (weight >= weightSum + truckList.get(i)) {
                    doList.add(truckList.get(i));
                    timer.add(0);
                    weightSum += truckList.get(i);
                    i++;
                }
            }

            for (int j = 0; j < timer.size(); j++) {
                timer.set(j, timer.get(j) + 1);
            }

            for (int j = 0; j < timer.size(); j++) {
                if (timer.get(0) >= bridge_length) {
                    weightSum -= doList.get(0);
                    timer.remove(0);
                    doList.remove(0);
                }
            }
            if (i == truck_weights.length && doList.isEmpty()) {
                answer++;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = { 10, 9,8,7,6,5,4 };
        System.out.println(solution(bridge_length, weight, truck_weights));
    }

}