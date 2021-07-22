package com.codetest.programmers;

import java.util.ArrayList;
import java.util.Collections;

/**
 * jakard
 * 프로그래머스 뉴스 클러스터링 문제
 */
public class Jakard {
    public int solution(String str1, String str2) {
        double jakard = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> union = new ArrayList<String>();
        ArrayList<String> intersection = new ArrayList<String>();

        for (int i = 0; i < str1.length() - 1; i++) {
            char a = str1.charAt(i);
            char b = str1.charAt(i + 1);
            if (Character.isLetter(a) && Character.isLetter(b)) {
                String str = Character.toString(a) + Character.toString(b);
                list1.add(str);

            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            char a = str2.charAt(i);
            char b = str2.charAt(i + 1);
            if (Character.isLetter(a) && Character.isLetter(b)) {
                String str = Character.toString(a) + Character.toString(b);
                list2.add(str);

            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        for (String s : list1) {
            if (list2.remove(s)) {
                intersection.add(s);
            }
            union.add(s);
        }
        for (String s : list2) {
            union.add(s);
        }

        if (union.size() == 0) {
            jakard = 1;
        } else {
            jakard = (double) intersection.size() / (double) union.size();
        }

        return (int) (jakard * 65536);
    }

    public static void main(String[] args) {
        Jakard jakard = new Jakard();
        System.out.println(jakard.solution("FRANCE", "french"));
    }
}