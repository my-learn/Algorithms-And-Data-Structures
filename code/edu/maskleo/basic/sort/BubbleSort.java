package edu.maskleo.basic.sort;

import static edu.maskleo.basic.SortTestHelper.generateRandomArray;
import static edu.maskleo.basic.SortTestHelper.print;
import static edu.maskleo.basic.SortTestHelper.swap;

/**
 * 冒泡排序：排序思想是不断的比较相邻的两个数，如果左边的数大于右边的数则将他们交换位置
 *
 * @author maskleo
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = generateRandomArray(500000, 5000);
        print(array);
        long start = System.currentTimeMillis();
        int sortIndex = array.length - 1;
        for (int i = 0; i <= sortIndex; ) {
            //前后比较,将较大的数与较小的数交换
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
            }
            //到了尾部，将数组末尾下标往前移一位，并从头开始遍历
            if (i + 1 == sortIndex) {
                sortIndex = i;
                i = 0;
            } else {
                i++;
            }
        }
        System.out.println("冒泡排序所需时间：" + (System.currentTimeMillis() - start));
        print(array);
    }
}
