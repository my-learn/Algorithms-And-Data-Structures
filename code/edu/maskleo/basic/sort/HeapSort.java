package edu.maskleo.basic.sort;

import static edu.maskleo.basic.SortTestHelper.generateRandomArray;
import static edu.maskleo.basic.SortTestHelper.print;

/**
 * 堆排序：先构建最大堆，然后依次移除最大值
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] array = generateRandomArray(500000, 5000);
        print(array);
        long start = System.currentTimeMillis();
        for (int ele : array) {

        }
    }
}
