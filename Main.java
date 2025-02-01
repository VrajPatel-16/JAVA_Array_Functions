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