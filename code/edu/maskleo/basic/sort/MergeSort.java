package edu.maskleo.basic.sort;

import java.util.Arrays;

import static edu.maskleo.basic.SortTestHelper.generateRandomArray;
import static edu.maskleo.basic.SortTestHelper.print;

/**
 * 归并排序: 将数组不断的二分分割,然后将每一段的结果排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array = generateRandomArray(500000, 5000);
        print(array);
        long start = System.currentTimeMillis();
        array = separate(array);
        System.out.println("归并排序所需时间：" + (System.currentTimeMillis() - start));
        print(array);
    }

    /**
     * 拆分数组
     *
     * @param arr
     * @return
     */
    public static int[] separate(int[] arr) {
        int length = arr.length;
        // 当只有一个元素时直接返回,拆分结束
        if (arr.length == 1) {
            return arr;
        }
        int mid = length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, length);
        return merge(separate(left), separate(right));
    }

    /**
     * 合并数组
     *
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int length = left.length + right.length;
        int[] result = new int[length];
        int l = 0, r = 0;
        // 将两个有序数组合并
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                result[l + r] = left[l];
                l++;
            } else {
                result[l + r] = right[r];
                r++;
            }
        }
        // 将剩下的元素直接加入
        while (l < left.length) {
            result[l + r] = left[l];
            l++;
        }
        while (r < right.length) {
            result[l + r] = right[r];
            r++;
        }
        return result;
    }

}