package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array[] = {2, 5, 7, 9, 16, 23, 27, 34, 45, 50, 62};

        int position = binarySearch(array, 45);

        if (position != -1)
            System.out.println("El número esta en la posición: " + (position + 1));
        else
            System.out.println("El número no se encuantra en el arreglo");
    }

    public static int binarySearch(int[] array, int search) {
        int lower = 0;
        int upper = array.length - 1;
        int position = -1;
        int mid;

        while (lower <= upper) {
            mid = (lower + upper) / 2;
            if (array[mid] == search) {
                position = mid;
                break;
            } else if (array[mid] > search) {
               upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }

        if (position == -1)
            return position;

        return position;
    }
}
