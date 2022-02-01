package com.robertocannella;

public class InsertionSort {
    public static void sort(Comparable[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(arr[j],arr[j-1]); j--) {
                exchange(arr, j, j-1);
            }
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
