//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran

public class NumberSorter {
    // Count the number of digits in the input number
    private static int getNumDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;  // Remove the last digit
            count++;  // Increment the digit count
        }
        return count;
    }

    // Get an array containing the sorted digits of the input number
    public static int[] getSortedDigitArray(int number) {
        int numDigits = getNumDigits(number);  // Calculate the number of digits
        int[] sorted = new int[numDigits];  // Create an array to hold sorted digits

        for (int i = 0; i < numDigits; i++) {
            int digit = number % 10;  // Get the last digit
            number /= 10;  // Remove the last digit
            sorted[i] = digit;  // Store the digit in the sorted array
        }

        // Sort the array in ascending order
        for (int i = 0; i < numDigits - 1; i++) {
            for (int j = 0; j < numDigits - 1 - i; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];  // Swap elements if they are out of order
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        return sorted;  // Return the sorted array of digits
    }
}
