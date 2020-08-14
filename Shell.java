package com.hjg.sort;

import java.util.Arrays;

/**
 * @author hjg
 * @date 2020/8/14 16:48
 */

//希尔排序 也称为缩小增量排序
//增量gap，并逐步缩小增量
    //希尔排序时间复杂度的下界是n*log2n
  //  希尔排序没有快速排序算法快 O(n(logn))
public class Shell {
    public static void shell(int[] arr){
      int len = arr.length;
      int gap = len /2;
      while (gap>0){
      for (int i=gap;i<len;i++){
          int j = i;
          while (j>=gap && arr[j-gap]>arr[j]){
              int temp = arr[j-gap];
              arr[j-gap] = arr[j];
              arr[j] = temp;
              j-=gap;
          }
      }
          gap/=2;
      }
    }
    public static void main(String[] args) {
        int[] arr ={3,6,8,1,3,9,4,2};
        shell(arr);
        System.out.println(Arrays.toString(arr));
    }
}
