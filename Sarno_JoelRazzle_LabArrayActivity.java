/*
 * Name: Joel Razzle Sarno
 * Course: Electronics Engineering
 * Lab Activity: Array Implementation and For Loop Practice - Problem 1
 * Submission Date: October 24, 2024
 */
package sarno_joelrazzle_labarrayactivity;

import java.util.Scanner;

/*
 *
 * @author Sarno
 */
public class Sarno_JoelRazzle_LabArrayActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display options to the user
        System.out.println("Select an option:");
        System.out.println("Type 0 for Sum and Average of an Array");
        System.out.println("Type 1 for Maximum and Minimum Element Finder");
        System.out.println("Type 2 for Reverse an Array");
        System.out.println("Type 3 for Frequency Counter\n");
        System.out.println("Type a number you want to try:");

        
        // Read the user's choice
        int choice = input.nextInt();

        // Use a switch statement to execute the selected option
        switch (choice) {
            case 0:
                // Call method to calculate sum and average of the array
                calculateSumAndAverage(input);
                break;
            case 1:
                // Call method to find the maximum and minimum element in the array
                findMaxAndMin(input);
                break;
            case 2:
                // Call method to reverse the array
                reverseArray(input);
                break;
            case 3:
                // Call method to count the frequency of a specified number in the array
                countFrequency(input);
                break;
            default:
                // In case of invalid option
                System.out.println("Invalid option");
        }

        // Close the scanner to prevent resource leak
        input.close();
    }

    // Method to calculate the sum and average of an array
    public static void calculateSumAndAverage(Scanner input) {
        // Declare an array of size 10
        int[] array = new int[10];

        // Variable to store the sum of the array elements
        int sum = 0;

        // Prompt the user to input 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < array.length; i++) {
            // Take each element input and add it to the sum
            array[i] = input.nextInt();
            sum += array[i]; // Add the current element to the sum
        }

        // Calculate the average by dividing the sum by the size of the array
        double average = sum / 10.0;  // Dividing by 10.0 to ensure floating-point division

        // Display the results
        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + average);

        // Sample Input:
        // 5 10 15 20 25 30 35 40 45 50
        // Sample Output:
        // Sum of array: 275
        // Average of array: 27.5
    }

    // Method to find the maximum and minimum elements in the array
    public static void findMaxAndMin(Scanner input) {
        // Declare an array of size 15
        int[] array = new int[15];

        // Prompt the user to input 15 integers
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < array.length; i++) {
            // Take each element input from the user
            array[i] = input.nextInt();
        }

        // Initialize max and min values with the first element of the array
        int max = array[0];
        int min = array[0];

        // Loop through the array to find the max and min elements
        for (int i = 1; i < array.length; i++) {
            // If current element is greater than max, update max
            if (array[i] > max) {
                max = array[i];
            }
            // If current element is smaller than min, update min
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Display the maximum and minimum values found
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        // Sample Input:
        // 12 32 32 1 2 3 4 6 6 3 2 1 4 8 9
        // Sample Output:
        // Maximum element: 32
        // Minimum element: 1
    }

    // Method to reverse the elements of the array
    public static void reverseArray(Scanner input) {
        // Declare an array of size 5
        double[] array = new double[5];

        // Prompt the user to input 5 floating-point numbers
        System.out.println("Enter 5 floating-point numbers:");
        for (int i = 0; i < array.length; i++) {
            // Take each floating-point input and store it in the array
            array[i] = input.nextDouble();
        }

        // Print the array in reverse order
        System.out.println("Array in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            // Print each element in reverse order
            System.out.print(array[i] + " ");
        }
        System.out.println();  // Print a newline after the reversed array

        // Sample Input:
        // 12 23 32 45 65
        // Sample Output:
        // Array in reverse order: 65.0 45.0 32.0 23.0 12.0
    }

    // Method to count the frequency of a specified number in the array
    public static void countFrequency(Scanner input) {
        // Declare an array of size 10
        int[] array = new int[10];

        // Prompt the user to input 10 integers between 1 and 100
        System.out.println("Enter 10 integers between 1 and 100:");
        for (int i = 0; i < array.length; i++) {
            // Take each element input from the user
            array[i] = input.nextInt();
        }

        // Ask the user for a number to check its frequency in the array
        System.out.println("Enter the number to check its frequency:");
        int numberToCheck = input.nextInt();

        // Variable to store the frequency count of the number
        int count = 0;

        // Loop through the array to count how many times the number appears
        for (int num : array) {
            if (num == numberToCheck) {
                // Increment the count if the number matches
                count++;
            }
        }

        // Display the result showing the frequency of the number
        System.out.println("The number " + numberToCheck + " appears " + count + " times in the array.");

        // Sample Input:
        // 12 54 65 45 54 65 21 12 3 4
        // Sample Output:
        // Enter the number to check its frequency: 12
        // The number 12 appears 2 times in the array.
    }
}
