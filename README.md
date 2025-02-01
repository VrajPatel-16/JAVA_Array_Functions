# Java Array Operations Program

## 📌 Description
This Java-based program performs multiple array-related operations:
- Separating even and odd numbers into different lists.
- Finding two neighboring numbers with the smallest difference.
- Converting an array into an `ArrayList` and vice versa.

The program follows **Java best practices**, including:
- **PascalCase** for class names.
- **camelCase** for method names.
- **snake_case** for variable names.

---

## 🚀 Features
- **Even-Odd Separation**: Classifies numbers into even and odd lists.
- **Smallest Consecutive Difference**: Finds two adjacent numbers with the smallest difference.
- **Array ↔ ArrayList Conversion**: Converts arrays to `ArrayList` and vice versa.

---

## 🛠️ File Structure
### 📄 `Main.java`
**Purpose:**  
- Serves as the entry point for the program.
- Displays a menu for users to choose different operations.
- Calls methods from `UserInput.java` and `ArrayFunctions.java`.

**Key Functionalities:**
- Takes user input for array operations.
- Calls respective functions for processing.
- Displays results to the user.

---

### 📄 `UserInput.java`
**Purpose:**  
- Handles user input for arrays and `ArrayList`.

**Methods:**
- `int[] arrayInput()`:  
  - Takes an array of integers from the user.
- `ArrayList<Integer> arrayListInput()`:  
  - Takes user input and stores it in an `ArrayList`.

---

### 📄 `ArrayFunctions.java`
**Purpose:**  
- Implements all array-related operations.

**Methods:**
1. **`void oddEven(int[] array)`**  
   - Separates even and odd numbers into two `ArrayList`s and displays them.

2. **`int minConsecutiveDifference(int[] array)`**  
   - Finds two neighboring numbers with the smallest difference.
   - Returns the index of the first number.

3. **`ArrayList<Integer> convertArrayToArrayList(int[] array)`**  
   - Converts an array into an `ArrayList<Integer>`.

4. **`int[] convertArrayListToArray(ArrayList<Integer> array_list)`**  
   - Converts an `ArrayList<Integer>` back into an array.

---
