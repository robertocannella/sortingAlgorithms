package com.robertocannella;

import java.io.PrintStream;
import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var bubbleSort = new BubbleSort();
        int[] intArray = {5,7,2,4,4,6,7,44};
        bubbleSort.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
