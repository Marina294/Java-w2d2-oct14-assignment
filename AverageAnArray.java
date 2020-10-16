// write two overloaded methods that return the average of an array with the following headers


// public static int average(int[] array)
// public static double average(double[] array)

// write a test program that prompts the user to enter ten double volues,
// invokes this method, and displays the average value

import java.util.Scanner;

public class AverageAnArray {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // array = index 10
            double[] numbers = new double[10];
            // enter value
            System.out.println("Enter ten double value: ");
            // loop
            for(int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextDouble();
            }

            // for(double num: numbers) {
            // System.out.println(num + 1);
            // }

            // print average
            System.out.println("Average is " + average(numbers));
            input.close();
        }


        public static double average(double[] array) {
        
            double  sum = 0.0;
            double counter = 0.0;

            for(double i: array) {
                sum += i;
                counter += 1;
            }
            
            return sum / counter;
            
    }

}