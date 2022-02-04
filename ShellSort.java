package com.robertocannella;

public class ShellSort {

    public static void sort(Comparable[] arr){
        int n = arr.length;
        int h = 1;
        while(h < n/3)
            h = 3*h +1; // 1, 4,13,40,121,363,1093

        while ( h >= 1){ // h-sort the array

            for (int i = h; i < n; i++) {  // set i to h
                for (int j = i; j >=h  && less(arr[j],arr[j-h]); j-=h) { //
                    exchange(arr, j, j-h);
                }
            }
            h = h/3;
        }


    }

    public static void exchange(Comparable[] arr, int i, int j ){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static boolean less(Comparable v, Comparable w){
        System.out.println(v.compareTo(w));
        return v.compareTo(w) < 0;
    }
}
