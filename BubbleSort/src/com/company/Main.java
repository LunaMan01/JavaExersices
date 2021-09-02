package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = {5, 8, 6, 7, 1, 4, 2, 3};
        System.out.println("Unsort: " + Arrays.toString(array));

        int[] arraySorted = sort(array);
        System.out.printf("Sort: " + Arrays.toString(arraySorted));
    }

    public static int[] sort(int array[]) {
        int aux = 0;
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        return array;
    }
}
