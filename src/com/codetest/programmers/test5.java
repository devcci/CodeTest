package com.codetest.programmers;
public class test5 {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] arr1_s = new String[arr1.length];
        String[] arr2_s = new String[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr1_s[i] = Integer.toBinaryString(arr1[i]);
            arr2_s[i] = Integer.toBinaryString(arr2[i]);

            if (arr1_s[i].length() != n) {
                for (int j = 0; j < n - arr1_s[i].length(); j++) {
                    arr1_s[i] = "0" + arr1_s[i];
                }
            }
            if (arr2_s[i].length() != n) {
                for (int j = 0; j < n - arr2_s[i].length(); j++) {
                    arr2_s[i] = "0" + arr2_s[i];
                }
            }

            for(int a=0; a<n; a++){
                int q = (int)(arr1_s[i].charAt(a)-'0');
                int w = (arr2_s[i].charAt(a)-'0');
                String e = q+w==0?" " : "#";
                answer[i] += e;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int n = 5;
        int[] arr1 = { 9, 20, 28, 18, 11 };
        int[] arr2 = { 30, 1, 21, 17, 28 };

        // scan.close();
        System.out.println(solution(n, arr1, arr2));
    }
}
