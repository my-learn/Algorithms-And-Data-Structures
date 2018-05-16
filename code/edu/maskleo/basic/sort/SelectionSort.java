package edu.maskleo.basic.sort;

import static edu.maskleo.basic.SortTestHelper.generateRandomArray;
import static edu.maskleo.basic.SortTestHelper.print;

/**
 * 选择排序：假设第一个值是最小值，然后往后查找最小值的下标直到结束，将最小值放到最前面去，然后从第二个开始找最小值，一直到结束
 */
public class SelectionSort {

    //TODO: 每次都和自己比较了,待优化
    public static void main(String[] args) {
        int[] array = generateRandomArray(100000, 5000);
        print(array);
        long start = System.currentTimeMillis();
        int minIndex = 0;
        int init = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (i == array.length - 1) {
                int temp = array[init];
                array[init] = array[minIndex];
                array[minIndex] = temp;
                i = init;
                minIndex = i + 1;
                init++;
            }
        }
        System.out.println("插入排序所需时间：" + (System.currentTimeMillis() - start));
        print(array);
    }
}
