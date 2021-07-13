package com.codetest.programmers;
import java.util.HashMap;
import java.util.Set;

public class test17 {
    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> clotheMap = new HashMap<String, Integer>();
        for (int i = 0; i < clothes.length; i++) {
            clotheMap.put(clothes[i][1], clotheMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        Set<String> keySet = clotheMap.keySet();

        for (String key : keySet) {
            answer *= clotheMap.get(key) + 1;
        }

        return answer-1;
    }

    public static void main(String[] args) {
        String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
                { "green_turban", "headgear" } };
        System.out.println(solution(clothes));
    }
}
