package edu.maskleo.basic.sort;

import static edu.maskleo.basic.SortTestHelper.generateRandomArray;
import static edu.maskleo.basic.SortTestHelper.print;

/**
 * 冒泡排序：排序思想是不断的比较相邻的两个数，如果左边的数大于右边的数则将他们交换位置
 *
 * @author maskleo
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = generateRandomArray(100000, 5000);
        print(array);
        long start = System.currentTimeMillis();
        int lastIndex = array.length - 1;
        for (int i = 0; i <= lastIndex; i++) {
            //前后比较,将较大的数与较小的数交换
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
            //到了尾部，将数组末尾下标往前移一位，并从头开始遍历，之所以是-1是因为循环完成将会执行 i++
            if (i + 1 == lastIndex) {
                lastIndex = i;
                i = -1;
            }
        }
        System.out.println("冒泡排序所需时间：" + (System.currentTimeMillis() - start));
        print(array);
    }
}
