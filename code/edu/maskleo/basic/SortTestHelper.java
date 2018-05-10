package edu.maskleo.basic;

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

    /**
     * @param n   数组的大小
     * @param max 随机数的最大值
     * @return
     */
    public static int[] generateRandomArray(int n, int max) {
        assert n > 0;
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(max + 1);
        }
        return arr;
    }

    /**
     * @param array
     */
    public static void print(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int t : array) {
            sb.append(t).append(",");
        }
        System.out.println(sb);
    }

}
