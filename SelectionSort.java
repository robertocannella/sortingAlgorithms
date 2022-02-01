package com.robertocannella;

import com.sun.tools.jconsole.JConsoleContext;

public class SelectionSort {
    public static void sort(Comparable[] arr){         // Sort a[] into increasing order
        int n = arr.length;

        for (int i = 0; i < n; i++) {           // exchange a[i] with the smallest entry in a[i], ... , a[n-1].
            int min = i;                        // index of a minimal entry
            for (int j = i+1; j < n; j++)  // we are comparing with the next element  a[i + 1]
                if (less(arr[j], arr[min])) min = j;

            exchange(arr, i, min);
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
