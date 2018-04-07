package edu.maskleo.basic;

import java.util.Arrays;
import java.util.Random;

public final class SortTestHelper {

    /**
     * @param n      数组的大小
     * @param rangeL 随机数的最小值
     * @param rangeR 随机数的最大值
     * @return
     */
    public static int[] generateRandomArray(int n, int rangeL, int rangeR) {
        assert n > 0;
        assert rangeR > rangeL;
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(rangeR - rangeL + 1) + rangeL;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray(20, 5, 15);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
