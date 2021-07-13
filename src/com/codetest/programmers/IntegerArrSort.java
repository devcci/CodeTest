package com.codetest.programmers;
import java.util.Arrays;
import java.util.Collections;

/* int배열 오름차순/내림차순 */
public class IntegerArrSort {
  public static void main(String[] args) {
    int[] numarr = { 3, 0, 6, 1, 5 };
    Arrays.sort(numarr);
    System.out.println(Arrays.toString(numarr));
    Integer[] inTnumar = new Integer[numarr.length];
    for (int i = 0; i < numarr.length; i++) {
      inTnumar[i] = numarr[i];
    }
    Arrays.sort(inTnumar, Collections.reverseOrder());

    System.out.println(Arrays.toString(inTnumar));
  }
}
