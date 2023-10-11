package numShift;

import java.util.Random;
import java.util.Arrays;

public class NumberShifter {
    public static int[] makeLucky7Array(int size) {
        int[] array = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            // Generate random numbers from 1 to 10
            array[i] = rand.nextInt(10) + 1;
        }

        return array;
    }

    public static void shiftEm(int[] array) {
        int currentIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                // Swap the current element with the element at the currentIndex
                int temp = array[i];
                array[i] = array[currentIndex];
                array[currentIndex] = temp;
                currentIndex++;
            }
        }
    }
}
