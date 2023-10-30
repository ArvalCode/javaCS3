package numShift;

import java.util.Random;
import java.util.Arrays;

public class NumberShifter {
    public static int[] makeLucky7Array(int size) {
        int[] array = new int[size];  // Create an integer array of the given size to hold random numbers
        Random rand = new Random();  // Create a Random object for generating random numbers

        for (int i = 0; i < size; i++) {
            // Generate random numbers from 1 to 10 and store them in the array
            array[i] = rand.nextInt(10) + 1;
        }

        return array;  // Return the generated random number array
    }

    public static void shiftEm(int[] array) {
        int currentIndex = 0;  // Initialize the current index to 0

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {  // Check if the current element is equal to 7
                // Swap the current element with the element at the currentIndex
                int temp = array[i];
                array[i] = array[currentIndex];
                array[currentIndex] = temp;
                currentIndex++;  // Move to the next index to continue shifting
            }
        }
    }
}
