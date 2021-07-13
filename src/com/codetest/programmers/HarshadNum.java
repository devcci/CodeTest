package com.codetest.programmers;
public class HarshadNum {
    // 하샤드수
    public static String solution(int num) {
        String answer = "";
        @SuppressWarnings("unused")
        int sum = 0;
        String numStr = Integer.toString(num);
        String arr[] = numStr.split("");
        int arr2[] = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            int temp = Integer.parseInt(arr[i]);
            arr2[i] = temp;
        }

        int arrSum = 0;

        while (num / 10 != 0) {
            sum += num % 10; // x를 10으로 나누어 나머지들은 자릿수이며 sum에 더해줌
            num = num / 10; // 다음 자릿수를 위해 나누기
        }
        for (int i = 0; i < numStr.length(); i++) {
            arrSum += arr2[i];
        }
        if (num % arrSum == 0) {
            answer = "yes";
        } else {
            answer = "no";
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        int num = 14;
        System.out.println(solution(num));
    }
}
