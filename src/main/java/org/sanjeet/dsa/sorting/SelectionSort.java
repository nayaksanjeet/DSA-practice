package org.sanjeet.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
//O(n^2)
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};

        System.out.println(Arrays.toString(sorting(arr)));
    }
    public static int[] sorting(int[] arr){
        int n = arr.length;
        for(int i =0;i<=n-2;i++){
            int minIndex = i;
            for(int j = i ;j<=n-1;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }

            }
           arr = swap(i,minIndex,arr);
        }
        return arr;
    }
    private static int[] swap(int a,int b,int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
