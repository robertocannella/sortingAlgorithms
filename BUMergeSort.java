package com.robertocannella;

public class BUMergeSort {
    private static Comparable[] aux;

    public static void sort(Comparable[] arr){
        int n = arr.length;

        aux = new Comparable[n];
        for (int len = 1; len < n ; len *=2) {
            for (int lo = 0; lo < n-len; lo += len+len) {
                merge(arr,lo,lo+len-1, Math.min(lo+len+len-1, n));
            }
        }
    }
    private static void merge(Comparable[] a, int lo, int mid, int hi){
        // System.out.println("Aux: " + Arrays.toString(aux));
        int i = lo;
        int j = mid +1;

        if (hi + 1 - lo >= 0) System.arraycopy(a, lo, aux, lo, hi + 1 - lo);

        for (int k = lo; k <= hi; k++) {
            //var isLess = aux[j].compareTo(aux[i]) < 0;
            if ( i > mid)                    a[k] = aux[j++];
            else if ( j > hi)                a[k] = aux[i++];
            else if (less(aux[j], aux[i] ))  a[k] = aux[j++];
            else                             a[k] = aux[i++];

        }
    }
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
}
