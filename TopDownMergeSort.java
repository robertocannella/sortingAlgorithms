package com.robertocannella;

import java.util.Arrays;

public class TopDownMergeSort {
    private static Comparable[] aux;


    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];         //  [9,3,6,8,2,1,5,7]

        sort(a, 0, a.length -1);
    }
    private static void sort(Comparable[] a, int lo, int hi){
        if (hi <= lo) return;

        int mid = lo + (hi - lo)/2;         // After one recursion: low = 1,  mid = 4, hi = 9
        sort(a, lo, mid);                   // Sort the left half  [9,3,6,8,2]  (this will check lo and hi(mid) for equality
        sort(a, mid+1, hi );             // Sort the right half [1,5,7,4,0]  (this will check lo(mid+1) and hi for equality
        merge(a, lo, mid, hi);             // Merge the results

    }
    private static void merge(Comparable[] a, int lo, int mid, int hi){
       // System.out.println("Aux: " + Arrays.toString(aux));
        int i = lo;
        int j = mid +1;

        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];

        for (int k = lo; k <= hi; k++) {
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
