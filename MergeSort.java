package com.hjg.sort;

import java.util.Arrays;

/**
 * @author hjg
 * @date 2020/8/14 23:21
 */
//归并排序的时间复杂度为nlogn
public class MergeSort {
    public static void merSort(int[] arr,int left,int right){
        if (left<right){
            int mid =(left+right)/2;
            merSort(arr,left,mid);
            merSort(arr,mid+1,right);
            merget(arr,left,mid,right);
        }
    }
    private static void merget(int[] arr,int left,int mid,int right){
            int[] temp = new int[right-left+1];
            int i=left;
            int j=mid+1;
            int k=0;
            while (i<=mid&&j<=right){
                if (arr[i]<arr[j]){
                    temp[k++]=arr[i++];
                }else{
                    temp[k++]=arr[j++];
                }
            }
            while (i<=mid)temp[k++]=arr[i++];
            while (j<=right)temp[k++]=arr[j++];
            for (int m=0;m<temp.length;m++){
                arr[m+left] = temp[m];
            }
    }
    public static void main(String[] args) {
        int[] arr ={3,6,8,1,3,9,4,2};
        merSort(arr,0,7);
        System.out.println(Arrays.toString(arr));
    }
}
