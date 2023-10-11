package numShift;

import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran

public class NumberShifterRunner {
    public static void main(String[] args) {
        int size = 20; // Change this to the desired array size
        int[] testArray = NumberShifter.makeLucky7Array(size);

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(testArray));

        NumberShifter.shiftEm(testArray);

        System.out.println("\nArray with Lucky 7s Shifted to the Front:");
        System.out.println(Arrays.toString(testArray));
    }
}
