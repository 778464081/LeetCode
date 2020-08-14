package com.hjg.sort;

import java.util.Arrays;

/**
 * @author hjg
 * @date 2020/8/14 15:08
 */

//冒泡排序时间复杂度O(n*n)
public class Bubble {
    public static void bubble(int[] arr){
        int len =arr.length;
        for (int i=0;i<len-1;i++){
            for (int j=0;j<len-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr ={3,6,8,1,3,9,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

}
