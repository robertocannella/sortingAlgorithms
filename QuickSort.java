package com.robertocannella;

public class QuickSort {
    public static void sort(Comparable[] array) {

        sort(array, 0, array.length - 1);
    }

    private static void sort(Comparable[] array, int start, int end) {
        if (start >= end)
            return;

        var boundary = partition(array, start, end);

        sort(array, start, boundary -1);
        sort(array, boundary + 1, end);
    }
    private static int partition(Comparable[] array, int start, int end){
        var pivot = array[end];
        var boundary = start-1;

        for (int i = start; i <= end; i++)
            if(array[i].compareTo(pivot) <= 0 )
                swap(array, i, ++boundary);

        return boundary;
    }
    private static void swap(Comparable[] array, int index1, int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
