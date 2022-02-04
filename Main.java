package com.robertocannella;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Random random = new Random();

        int n = 20;
        //Comparable[] intArray =  new Comparable[n];
        //for (int i = 0; i < n; i++) intArray[i] = random.nextDouble();
        //Comparable[] intArray = {5,7,2,4,4,6,7,44,32,23,1,6,5,7,4,2,4,6,435,2,32,234,2,32,34,2344,43};
        //Comparable[] intArray = {'M','E','R','G','E','S','O','R','T','E','X','A','M','P','L','E'};
        Comparable[] intArray = {9,3,8,6,2,1,5,7};
        //Comparable[] intArray = {4,2,1};
        QuickSort.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
