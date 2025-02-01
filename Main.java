// Main.java
// Name: Vraj Patel
// PRN: 23070126147
// Batch: AIML-B3


// Main class to execute the program
import java.util.ArrayList; // importinf arraylist


class Main {
    public static void main(String args[]) {
        // Create objects for input and operations
        UserInput user_input = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();

        System.out.println("Choose an option:");
        System.out.println("1. Separate even and odd numbers into arrays");
        System.out.println("2. Find neighboring numbers with the smallest distance");
        System.out.println("3. Convert array to ArrayList and vice versa");

        // Read input array from the user
        int[] array = user_input.arrayInput();

        // Option 1: Separate even and odd numbers
        System.out.println("\nOption 1: Separate even and odd numbers:");
        functions.oddEven(array);

        // Option 2: Find neighboring numbers with the smallest distance
        System.out.println("\nOption 2: Find neighboring numbers with the smallest distance:");
        int index = functions.minConsecutiveDifference(array);
        System.out.println("Index of the first number: " + index);

        // Option 3: Convert array to ArrayList and vice versa
        System.out.println("\nOption 3: Convert array to ArrayList and vice versa:");
        ArrayList<Integer> array_list = functions.convertArrayToArrayList(array);
        System.out.println("Converted to ArrayList: " + array_list);

        int[] converted_array = functions.convertArrayListToArray(array_list);
        System.out.println("Converted back to array:");
        for (int num : converted_array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
