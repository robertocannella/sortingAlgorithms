package com.robertocannella;

public class BubbleSort {
    public void sort(int[] arr){
        boolean isSorted;

        for (int j = 0; j < arr.length; j++) {
            isSorted = true;  // adding this boolean, allows us to exit the algorithm if no swaps occur
            for (int i = 0; i < arr.length -1 - j; i++) { // here we can optimize by factoring out the previously bubbled element
                if (arr[i] > arr [i+1]) {
                    swap(arr, i, i + 1);
                    isSorted = false;
                }
            }
            if (isSorted)
                return;
        }
    }
    private void swap(int[] array, int index1, int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
