package com.hjg.sort;

import java.util.Arrays;

/**
 * @author hjg
 * @date 2020/8/14 15:40
 */
//快排时间复杂度 O(nlogn)
public class Quick {
    public static void quick(int[] arr){
        int left =0;
        int right = arr.length-1;
        if (right<=0){
            return;
        }
        sort(arr,left,right);
    }
    public static void sort(int[] arr,int left,int right){
        if (left>right){
            return;
        }
        int i=left;
        int j=right;
        int base =arr[left];
        while (i<j){
            while (arr[j]>=base&&i<j){
                j--;
            }
            while (arr[i]<=base&&i<j){
                i++;
            }
            if (i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        arr[left]=arr[i];
        arr[i]=base;
        sort(arr,0,i-1);
        sort(arr,j+1,right);
    }

    public static void main(String[] args) {
        int[] arr ={3,6,8,1,3,9,4,2};
        quick(arr);
        System.out.println(Arrays.toString(arr));
    }
}
