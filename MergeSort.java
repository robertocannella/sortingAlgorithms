package com.robertocannella;

public class MergeSort {

    public static void sort(Comparable[] arr){
        if (arr.length < 2)
            return;
        // divide array in half

        var middle = arr.length/2;

        Comparable [] left = new Comparable[middle];

        System.arraycopy(arr, 0, left, 0, middle);

        Comparable[] right = new Comparable[arr.length - middle];
        if (arr.length - middle >= 0) System.arraycopy(arr, middle, right, middle - middle, arr.length - middle);
//        for (int i = middle; i < arr.length ; i++)
//            right[i - middle] = arr[i];
        // sort each half
        sort(left);
        sort(right);
        // merge results
        merge(left,right,arr);

    }

    private static void merge(Comparable[] left, Comparable[] right, Comparable[] result){

        int i=0, j=0, k = 0;  // i for left partition, j for right partition, k for result[]

        while(i < left.length && j < right.length){
            if (left[i].compareTo(right[j]) < 0)
                result[k++] = left[i++];
            else
                result[k++] = right[j++];

        }
        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
    }

}
