package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {4, 6, 8, 1, 7, 2, 5, 3};

        System.out.println("Unsort: " + Arrays.toString(array));
        int[] sortArray = selectionSort(array);
        System.out.println("Sort: " + Arrays.toString(sortArray));
    }

    public static int[] selectionSort(int[] array) {
        int j = 0;
        int k = 0;
        int min = 0;
        int temp = 0;
        int flag = 0;

        while (j <= array.length - 1) {
            min = array[j];
            for (int i = j + 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                    k = i;
                    flag = 1;
                }
            }
            if (flag == 1) {
                temp = array[j];
                array[j] = array[k];
                array[k] = temp;
            }

            j++;
            flag = 0;
        }
        return array;
    }
}
