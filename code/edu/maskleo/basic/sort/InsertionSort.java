package edu.maskleo.basic.sort;

import static edu.maskleo.basic.SortTestHelper.generateRandomArray;
import static edu.maskleo.basic.SortTestHelper.print;

/**
 * 插入排序:
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = generateRandomArray(100000, 5000);
        print(array);
        long start = System.currentTimeMillis();
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int min = array[index];
            for (int j = min; j > 0; min--) {

            }
        }
    }
}
