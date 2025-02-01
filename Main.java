import java.util.*;

// Class to handle various array-related operations
class ArrayFunctions {

    // Method to display an ArrayList
    public void display(ArrayList<Integer> array_list) {
        System.out.println("Array is: " + array_list);
    }

    // Method to separate even and odd numbers into respective ArrayLists
    public void oddEven(int[] array) {
        ArrayList<Integer> even_list = new ArrayList<>(); // List to store even numbers
        ArrayList<Integer> odd_list = new ArrayList<>();  // List to store odd numbers

        // classify numbers as even or odd
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even_list.add(array[i]); // Add even number to the even list
            } else {
                odd_list.add(array[i]); // Add odd number to the odd list
            }
        }

        // Display the odd and even numbers
        System.out.println("Odd numbers:");
        display(odd_list);
        System.out.println("Even numbers:");
        display(even_list);
    }

    // Method to find the index of two neighboring numbers with the smallest difference
    public int minConsecutiveDifference(int[] array) {
        int index = 0; // Initialize index of the smallest difference

        // Loop through the array to find the smallest consecutive difference
        for (int i = 0; i < array.length - 1; i++) {
            if (Math.abs(array[i] - array[i + 1]) < Math.abs(array[index] - array[index + 1])) {
                index = i; // Update index if a smaller difference is found
            }
        }
        return index; // Return the index of the first number
    }

	// Method to convert an array into an ArrayList
    public ArrayList<Integer> convertArrayToArrayList(int[] array) {
        ArrayList<Integer> array_list = new ArrayList<>();
        for (int num : array) {
            array_list.add(num); // Add each element from the array to the ArrayList
        }
        return array_list;
    }