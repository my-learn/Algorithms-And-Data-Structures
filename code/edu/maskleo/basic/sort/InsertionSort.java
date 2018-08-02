package edu.maskleo.basic.sort;

import static edu.maskleo.basic.SortTestHelper.generateRandomArray;
import static edu.maskleo.basic.SortTestHelper.swap;
import static edu.maskleo.basic.SortTestHelper.print;

/**
 * 插入排序: 从第二个数开始与前面的数比较，小则继续往前面比较，大则留在当前位置
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = generateRandomArray(100000, 5000);
        print(array);
        long start = System.currentTimeMillis();
        // 这里是从第二个开始遍历与前面的数比较
        for (int i = 1; i < array.length; i++) {
            // 这里代码优化了，判断与前面一个数比较大小，如果大于等于前面的数就不用继续往前面比较了
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                swap(array, j, j - 1);
            }
        }
        System.out.println("插入排序所需时间：" + (System.currentTimeMillis() - start));
        print(array);
    }
}
