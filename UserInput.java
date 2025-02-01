import java.util.*;

// Class to handle user input
class UserInput {

    // Method to take input for an array of 5 integers
    int[] arrayInput() {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5]; // Fixed array size of 5
        System.out.println("Enter 5 numbers:");

        // Loop to take input for the array
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }