package numSort;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -  Nolan Tran

public class NumberSorter {
    // Count the number of digits in the input number
    private static int getNumDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Get an array containing the sorted digits of the input number
    public static int[] getSortedDigitArray(int number) {
        int numDigits = getNumDigits(number);
        int[] sorted = new int[numDigits];

        for (int i = 0; i < numDigits; i++) {
            int digit = number % 10;  // Get the last digit
            number /= 10;  // Remove the last digit
            sorted[i] = digit;
        }

        // Sort the array in ascending order
        for (int i = 0; i < numDigits - 1; i++) {
            for (int j = 0; j < numDigits - 1 - i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        return sorted;
    }
}
