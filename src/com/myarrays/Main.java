/**
 *  Java program to sort an array with insertion algorithm.
 */

package com.myarrays;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an array.
        double[] array = {4.9, 8.7, 9.0, 1.5, 6.8, 3.2, 6.0};

        // Calling method to sort an array.
        insertionSort(array);
    }

   // Method insertionSort() to sort the array of doubles.
    public static void insertionSort(double[] array) {

        // Iterating through the array.
        for (int index = 0; index < array.length; index++) {

            double key = array[index];

            int j = index - 1;
            while (j >=0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        // Printing the sorted array.
        for (double el : array) {
            System.out.print(el + "  ");
        }
    }
}