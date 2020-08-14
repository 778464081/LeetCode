package com.hjg.sort;

import java.util.Arrays;

/**
 * @author hjg
 * @date 2020/8/14 16:07
 */
//插入排序 最佳情况：T(n) = O(n)   最坏情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
public class Insertion {
    public static void insertion(int[] arr){
        int len=arr.length;
        for (int i=1;i<len;i++){
            int temp = arr[i];
            int j ;
            for (j=i;j>0&&arr[j-1]>temp;j--){
                arr[j]=arr[j-1];
            }
            arr[j]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr ={3,6,8,1,3,9,4,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
