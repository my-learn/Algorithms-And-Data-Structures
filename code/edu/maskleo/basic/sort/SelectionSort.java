package edu.maskleo.basic.sort;

import static edu.maskleo.basic.SortTestHelper.generateRandomArray;
import static edu.maskleo.basic.SortTestHelper.print;

/**
 * 选择排序：找到第一个最小的放在前面，然后找到第二个最小的放在第二位，找到第三个最小的以此类推
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = generateRandomArray(100, 1000);
        print(array);
        long start = System.currentTimeMillis();
        // 每次查找时的最小值下标记录
        int minIndex = 0;
        // 每次查找时的初始位置记录
        int sortIndex = 0;
        final int length = array.length;
        // 因为默认了最小下标是 0，所以这里从 1 开始查找
        for (int i = 1; i < length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            // 找到了最小值, 将值调换位置
            if (i + 1 == length) {
                int t = array[sortIndex];
                array[sortIndex] = array[minIndex];
                array[minIndex] = t;
                // 开始查找的下标 +1
                sortIndex++;
                // 默认的最小值为查找时的第一个值
                minIndex = sortIndex;
                // 从最小值 +1 去找第 sortIndex 个最小值，因为这个循环还有 i++
                i = minIndex;
            }
        }
        System.out.println("选择排序所需时间：" + (System.currentTimeMillis() - start));
        print(array);
    }
}
