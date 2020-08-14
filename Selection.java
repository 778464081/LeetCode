package com.hjg.sort;

import java.util.Arrays;

/**
 * @author hjg
 * @date 2020/8/14 15:24
 */
//选择排序 时间复杂度 O(n*n)
public class Selection {
    public static void select(int[] arr){
        int len =arr.length;
        for (int i=0;i<len-1;i++){
            int minindex = i;
            for (int j=i+1;j<len;j++){
                if (arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] =arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr ={3,6,8,1,3,9,4,2};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
}
