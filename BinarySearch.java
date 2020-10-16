// Write a binary search algorithm method in Java. 
// you will have to set some arrays 
// inside your main method in order to test 
// your binary search.


import java.util.Arrays;


public class BinarySearch {
    public static void main(String[] args) {
        Object arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 17, 21, 25, 28, 29, 30, 32, 38, 45};

        Arrays.sort(arr);
 
        System.out.println("The sorted array is: ");
        for (Object num : arr) {

            System.out.print(num + ", ");
        }
        int serchNum = 6;
        int returnNum = Arrays.binarySearch(arr, serchNum);

        System.out.println("The index of element " + serchNum + " is `" + returnNum + "`.");

    }
}