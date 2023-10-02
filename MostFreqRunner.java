

public class MostFreqRunner {
    public static int mostFrequentValue(int[] arr) {
        int mostFrequent = arr[0]; // Initialize with the first element
        int maxFrequency = 1;     // Initialize with a frequency of 1

        for (int i = 0; i < arr.length; i++) {
            int currentFrequency = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    currentFrequency ++;
                }
            }

            if (currentFrequency > maxFrequency) {
                mostFrequent = arr[i];
                maxFrequency = currentFrequency;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        // Sample Data
        int[][] data = {
            {-99, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 9, 10, 12345, 5, 5, 5, 5},
            {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99},
            {10, 20, 30, 40, 50, 10, 10, 40, 30, 20, 10},
            {32767},
            {255, 255},
            {9, 10, -88, 100, -555, 1000},
            {10, 10, 10, 11, 456, 10, 10, 2, 2, 2, 2, 2, 2, 2},
            {-111, 1, 2, 3, 9, 11, 20, 30},
            {9, 8, 7, 6, 5, 4, 3, 2, 0, -2, -989},
            {12, 12, 15, 18, 21, 23, 1000},
            {250, 19, 17, 15, 13, 13, 13, 13, 11, 10, 9, 6, 3, 2, 1, 1},
            {9, 10, -8, 10000, -5000, 1000}
        };

        // Calculate and print the most frequent value for each sample data
        for (int[] arr : data) {
            int result = mostFrequentValue(arr);
            System.out.println(result);
        }
    }
}