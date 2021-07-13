package com.codetest.programmers;
import java.util.Arrays;

public class test15 {

    // 완주못한 사람이 무조건 1명인 경우
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length - 1; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        answer = participant[participant.length - 1];
        return answer;
    }

    public static void main(String[] args) {
        String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
        String[] completion = { "josipa", "filipa", "marina", "nikola" };
        System.out.println(solution(participant, completion));
    }
}
