/*
 * Description
 * This is not the official sample solution from the University
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperator {

    private static int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        int[] numbers = new int[ARRAY_LENGTH];

        // Read in the array from keyboard
        readArray(numbers);

        // Display an array
        display(numbers);

        // Get maximum value of an array
        int max = getMax(numbers);
        System.out.println("Max value is: " + max);

        // Get the sum of all elements in an array
        int sum = getSum(numbers);
        System.out.println("Sum is: " + sum);

        // Sort array elements in descending order
        sortArrayDescendingly(numbers);

        // Display an array
        display(numbers);

        // Find the element with the largest number of appearances
        // If there is a tie then return the smaller element
        int mostFrequent = getMostFrequent(numbers);
        System.out.println("Most frequent value is: " + mostFrequent);
    }

    public static void readArray(int[] array) {
        System.out.print("Enter 10 integers: ");
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = keyboard.nextInt();
        }
    }

    public static void display(int[] array) {
        System.out.print("Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

//        System.out.println(Arrays.toString(array));
    }

    public static int getMax(int[] array) {
        int tempMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (tempMax < array[i]) {
                tempMax = array[i];
            }
        }
        return tempMax;
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void sortArrayDescendingly(int[] array) {
        Arrays.sort(array); // asc order
        System.out.println(array.length / 2);
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(i);
            int first = array[i];
            int last = array[array.length - i - 1];
            array[i] = last;
            array[array.length - i - 1] = first;
        }
    }
    public static int getMostFrequent(int[] array) {
        // Since the array is already sorted, same elements are next to each other.
        // We can scan the array once and count the element frequency during the scan
        int frequency = 1;
        int mf_result = array[0]; // 1
        int count = 1;
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1])
                count++;
            else {
                if (count > frequency) {
                    frequency = count;
                    mf_result = array[i - 1];
                }
                count = 1;
            }
        }
        if (count > frequency) {
            frequency = count;
        }
        return mf_result;
    }
}
