# Algorithms-And-Data-Structures
程序猿的内功修炼，学好算法与数据结构


## 生成随机数的基类

### [SortTestHelper.java](code/edu/maskleo/basic/SortTestHelper.java)

- `generateRandomArray` 生成一个限定区间的随机数组

![](static/849589-20180402133438219-1946132192.png)

### 插入排序

- 通俗理解：例如在打扑克整理的时候，拿到第二张牌开始就与第一站牌比较是否插入在前面还是后面，第三张又与排好的第二张比较，依次类推

- 动图如下

![](static/insertion-sort.gif)

- [代码实现](code/edu/maskleo/basic/sort/InsertionSort.java)

### 选择排序

- 通俗理解：先找到最小的放到最前面，然后找到除开第一个最小的放在第二位，然后找到除开前面两个最小的放在第三位，以此类推

- 动图如下

![](static/selection-sort.gif)

- [代码实现](code/edu/maskleo/basic/sort/SelectionSort.java)

### 归并排序

- 通俗理解: 拆分成小段然后每一个小段进行排序, 类似二叉树的中序遍历

![](static/merge-sort.gif)

- [代码实现](code/edu/maskleo/basic/sort/MergeSort.java)


## 参考资料
- [十大经典排序算法（动图演示）](https://www.cnblogs.com/onepixel/articles/7674659.html)

## LICENSE

![](LICENSE.png)
