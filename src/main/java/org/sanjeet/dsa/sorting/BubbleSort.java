package org.sanjeet.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
//optimised code best case O(n)
    //worst case O(n^2)
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
       // int[] arr = {9, 13, 20, 24, 46, 52};  best case scenario
        int n = 6;
        for (int i =n-1;i>=0;i--){
            int swapFlag =0; //optimization
            for (int j = 0; j <=i-1 ; j++) {
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapFlag =1; //optimization
                }
            }
            //optimization
            if(swapFlag ==0){
                break;
            }
            System.out.println("executed");
        }
        System.out.println(Arrays.toString(arr));
    }
}
