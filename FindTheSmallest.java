// Find the smallest ellement
// Write a method that finds the smallest element 
// in an array of double values using the following hearder:

// public static double min(double[] array)

// Write a test program that prompts the user to enter ten numbers,
// invokes this method to return the minimum value, 
// and displays the minimum value. 
// Here is a sample run of the program:

// Enter ten numbers: 1.9 2.5. 3.7 2 1.5 6 3 4 5 2
// The minimum number is: 1.5
import java.util.Scanner;

public class FindTheSmallest {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // prompts the user to enter ten double volues
        double[] numbers = new double[10];
          // enter value   
        System.out.println("Problem 4, Enter ten number: ");
        // loop
        for(int i = 0; i < numbers.length; i++) {

            numbers[i] = input.nextDouble();

        } 
        // print min
        System.out.println("The minimum number is: " + min(numbers));
        input.close();
    }

    public static double min(double[] array) {
        double min = array[0];

        for(double i = 1; i < array.length; i++) {
        // minimum
            if(min > array[0]) {
                min = array[0];
            }
        }
        return min;

    }
}