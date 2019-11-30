package com.example.demo.bubleSort;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] array = new int[]{10, -10,5, 3, 15, 1, 8, 12, 2, 2, 300, 200, 233, -1,-10,1000};

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                int leftNumber = array[i];
                int rightNumber = array[i + 1];

                if (leftNumber > rightNumber) {
                    array[i + 1] = leftNumber;
                    array[i] = rightNumber;
                    isSorted = false;
                }
                    System.out.println(Arrays.toString(array));

            }

        }
    }
}
