package com.robertocannella;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Comparable[] intArray = {5,7,2,4,4,6,7,44};
        //Comparable[] intArray = {'S','O','R','T','E','X','A','M','P','L','E'};
        InsertionSort.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
