package com.codetest.programmers;
import java.util.Scanner;

public class HarshadNum2 {

    // 자릿수 합
    public static int testMethod(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    // 하샤드 수 판별
    public static boolean testMethod2(int num) {
        if (num == 0) {
            return false;
        }
        boolean result = false;
        int sum = 0;
        int n = num;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        if (num % sum == 0) {
            result = true;
        }
        return result;
    }

    // 정수 뒤집기
    public static int reverseInt(int num) {
        int result = 0;
        while(num != 0){
            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        System.out.println(testMethod(x));
        System.out.println(testMethod2(x));
        System.out.println(reverseInt(x));
    }
}
