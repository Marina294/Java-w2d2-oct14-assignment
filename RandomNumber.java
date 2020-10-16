// This method will take in an array of numbers, 
// and return a random number between 1 and 54 
// that is not included in the array. 
// You will need to create arrays 
// in your main method to test this.

import java.lang.Math;

public class RandomNumber {
    public static void main(String[] args) {
       // and return a random number between 1 and 54 
       // that is not included in the array.
        int[] randumNumbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 54, 55};
        
        System.out.println("Need Number: " + getRandom(randumNumbers));
    }

    public static int getRandom(int[] numbers) {
        byte counter = 0;

        while(true) {
            int random = (int)((Math.random() * 53) + 1); 
            for(int i: numbers) {
                if (i == random) {
                    counter++;
                }
            }        

            if(counter == 0) {
                return random;
            }
            else {
                counter = 0;
            }
        }

    }
}
