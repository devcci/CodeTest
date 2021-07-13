package com.codetest.programmers;
import java.util.Arrays;
import java.util.Collections;

/* 타입 변환 후 뒤집기 */
public class TypeReverse {
    public static long solution(long n) {
        long answer = 0;

        String nStr = String.valueOf(n);
        int len = nStr.length();

        Integer[] arr = new Integer[len];
        for(int i = 0 ; i < len; i ++){
            arr[i] = (int)nStr.charAt(i)-'0';
        }

        Arrays.sort(arr, Collections.reverseOrder());
       
        answer = Long.parseLong(Arrays.toString(arr).replaceAll("[^0-9]",""));
        return answer;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        long n =1234;

        // scan.close();
        System.out.println(solution(n));
    }
}

